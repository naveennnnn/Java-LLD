package Machine_Coding.ParkingLot.Service;

import java.util.Optional;
import java.time.Instant;
import java.time.Duration;

import Machine_Coding.ParkingLot.Exception.InvalidTicketException;
import Machine_Coding.ParkingLot.Model.Bill;
import Machine_Coding.ParkingLot.Model.Ticket;
import Machine_Coding.ParkingLot.Repository.TicketRepo;

public class BillService {
    private TicketRepo ticketRepo;
    public BillService(TicketRepo ticketRepo){
        this.ticketRepo = ticketRepo;
    }
    public Bill generateBill(Long ticketId, long gateId) throws InvalidTicketException{
        Optional<Ticket> opTicket = ticketRepo.getTicketById(ticketId);
        if(opTicket.isEmpty()){
            throw new InvalidTicketException("Invalid Ticket ID");
        }
        Ticket ticket = opTicket.get();
        Bill bill = new Bill();
        bill.setTicketId(ticketId);
        Instant exit = Instant.now();
        bill.setExitTime(exit);
        Duration duration = Duration.between(ticket.getEntryTime(),exit);
        double price = ticket.getPricingStrategy().calculatePrice(duration.toDays(), duration.toHours()%24, duration.toMinutes()%60, duration.toSeconds()%60);
        bill.setPrice(price);
        bill.setGateId(gateId);
        return bill;
    }
}
