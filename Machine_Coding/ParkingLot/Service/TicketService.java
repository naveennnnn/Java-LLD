package Machine_Coding.ParkingLot.Service;

import Machine_Coding.ParkingLot.Model.Ticket;
import Machine_Coding.ParkingLot.Model.Vehicle;
import Machine_Coding.ParkingLot.Repository.TicketRepo;
import Machine_Coding.ParkingLot.Strategy.PricingStrategy;

import java.time.Instant;

public class TicketService {
    TicketRepo ticketRepo;
    public TicketService(TicketRepo ticketRepo){
        this.ticketRepo = ticketRepo;
    }
    public Ticket createTicket(Vehicle vehicle,long gateId,PricingStrategy pricingStrategy){
        Ticket ticket = new Ticket();
        ticket.setEntryTime(Instant.now());
        ticket.setGateId(gateId);
        ticket.setPricingStrategy(pricingStrategy);
        ticket.setVehicle(vehicle);
        ticketRepo.save(ticket);
        return ticket;
    }
}
