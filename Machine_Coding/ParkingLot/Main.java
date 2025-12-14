package Machine_Coding.ParkingLot;

import java.time.Instant;
import java.util.Optional;
import java.util.Scanner;

import Machine_Coding.ParkingLot.Controller.BillController;
import Machine_Coding.ParkingLot.Controller.TicketController;
import Machine_Coding.ParkingLot.Model.BillStatus;
import Machine_Coding.ParkingLot.Model.Gate;
import Machine_Coding.ParkingLot.Model.GateType;
import Machine_Coding.ParkingLot.Model.Vehicle;
import Machine_Coding.ParkingLot.Model.VehicleType;
import Machine_Coding.ParkingLot.Repository.GateRepo;
import Machine_Coding.ParkingLot.Repository.TicketRepo;
import Machine_Coding.ParkingLot.Service.BillService;
import Machine_Coding.ParkingLot.Service.TicketService;
import Machine_Coding.ParkingLot.Strategy.FourWheelerStrategy;
import Machine_Coding.ParkingLot.Strategy.TwoWheelerStrategy;
import Machine_Coding.ParkingLot.dto.BillRequestDto;
import Machine_Coding.ParkingLot.dto.BillResponseDto;
import Machine_Coding.ParkingLot.dto.TicketRequestDto;
import Machine_Coding.ParkingLot.dto.TicketResponseDto;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        GateRepo gateRepo = new GateRepo();
        Gate gate1 = new Gate(0,GateType.ENTRY);
        Gate gate2 = new Gate(0,GateType.ENTRY);
        Gate gate3 = new Gate(0,GateType.ENTRY);
        Gate gate4 = new Gate(0,GateType.EXIT);
        Gate gate5 = new Gate(0,GateType.EXIT);
        gateRepo.save(gate1);
        gateRepo.save(gate2);
        gateRepo.save(gate3);
        gateRepo.save(gate4);
        gateRepo.save(gate5);
        TwoWheelerStrategy.setPriceForFirst3Hour(100);
        TwoWheelerStrategy.setPriceForExtraHour(50);

        FourWheelerStrategy.setPriceForFirst3Hour(200);
        FourWheelerStrategy.setPriceForExtraHour(75);

        TicketRepo ticketRepo = new TicketRepo();
        TicketService ticketService = new TicketService(ticketRepo);
        TicketController ticketController = new TicketController(ticketService);

        BillService billService = new BillService(ticketRepo);
        BillController billController = new BillController(billService);

        while(true){
            System.out.println("Enter the type of gate id:");
            /**
             * These gate checking has to be done in a separate service implementation class.
             */
            Long gateId = sc.nextLong();
            Optional<Gate> opGate = gateRepo.findGateById(gateId); 
            if(opGate.isEmpty()){
                System.out.println("Invalid gate Id");
                continue;
            }
            Gate gate = opGate.get();
            TicketRequestDto ticketReq = new TicketRequestDto();
            BillRequestDto billReq = new BillRequestDto();
            if(gate.getGateType().toString() == "ENTRY"){
                System.out.println("ENter the vehicle type (2W/4W):");
                String vehicleType = sc.next();
                VehicleType vType;
                if(vehicleType.equals("2W")){
                    vType = VehicleType.TWOW;
                    TwoWheelerStrategy pricingStrategy = new TwoWheelerStrategy();
                    ticketReq.setPricingStrategy(pricingStrategy);
                }
                else if(vehicleType.equals("4W")){
                    vType = VehicleType.FOURW;
                    FourWheelerStrategy pricingStrategy = new FourWheelerStrategy();
                    ticketReq.setPricingStrategy(pricingStrategy);
                }
                else{
                    System.out.println("Invalid vehicle type");
                    continue;
                }

                System.out.println("Enter vehicle number: ");
                String vNumber = sc.next();
                Vehicle vehicle = new Vehicle();
                vehicle.setVehicleNumber(vNumber);
                vehicle.setVehicleType(vType);

                ticketReq.setGateId(gateId);
                ticketReq.setVehicle(vehicle);
                TicketResponseDto response = ticketController.createTicket(ticketReq);

                System.out.println("TICKET CREATED ");
                System.out.println("Gate Id: "+response.getGateId());
                System.out.println("Entry time :"+response.getEntryTime());
                System.out.println("ticket ID: "+response.getId());
            }
            else if(gate.getGateType().toString() == "EXIT"){
                System.out.println("ENter the ticket ID");
                long ticketId = sc.nextLong();

                billReq.setGateId(gateId);
                billReq.setTicketId(ticketId);
                BillResponseDto billReponse = billController.generateBill(billReq);

                if(billReponse.getBillStatus() == BillStatus.FAILURE){
                    System.out.println("Ticket Id Not Found");
                }
                else{
                    System.out.println("BILL GENERATED");
                    System.out.println("Bill ID: "+billReponse.getId());
                    System.out.println("Ticket ID: "+billReponse.getTicketId());
                    System.out.println("Exit Time: "+billReponse.getExitTIme());
                    System.out.println("Gate ID: "+billReponse.getGateId());
                    System.out.println("Price: "+billReponse.getPrice());
                }
            }
        }
    }
}
