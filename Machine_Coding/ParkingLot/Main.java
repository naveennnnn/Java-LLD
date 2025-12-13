package Machine_Coding.ParkingLot;

import Machine_Coding.ParkingLot.Controller.TicketController;
import Machine_Coding.ParkingLot.Model.Vehicle;
import Machine_Coding.ParkingLot.Model.VehicleType;
import Machine_Coding.ParkingLot.Repository.TicketRepo;
import Machine_Coding.ParkingLot.Service.TicketService;
import Machine_Coding.ParkingLot.Strategy.TwoWheelerStrategy;
import Machine_Coding.ParkingLot.dto.TicketRequestDto;
import Machine_Coding.ParkingLot.dto.TicketResponseDto;

public class Main {
    public static void main(String []args){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNumber("TN-10-CA-0095");
        vehicle.setVehicleType(VehicleType.TWOW);
        vehicle.setId(1);

        long gateId = 1;
        TwoWheelerStrategy pricingStrategy = new TwoWheelerStrategy();
        TwoWheelerStrategy.setPriceForFirst3Hour(100);
        TwoWheelerStrategy.setPriceForExtraHour(50);

        TicketRequestDto req = new TicketRequestDto();
        req.setGateId(gateId);
        req.setPricingStrategy(pricingStrategy);
        req.setVehicle(vehicle);

        TicketRepo ticketRepo = new TicketRepo();

        TicketService ticketService = new TicketService(ticketRepo);

        TicketController ticketController = new TicketController(ticketService);

        TicketResponseDto ticket = ticketController.createTicket(req);

        System.out.println("Gate Id: "+ticket.getGateId());
        System.out.println("Entry time :"+ticket.getEntryTime());
    }
}
