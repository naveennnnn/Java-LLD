package Machine_Coding.ParkingLot.Repository;

import java.util.HashMap;
import java.util.Optional;

import Machine_Coding.ParkingLot.Model.Ticket;

public class TicketRepo {
    HashMap<Long,Ticket> hm;
    public TicketRepo(){
        hm = new HashMap<>();
    }

    public Ticket save(Ticket ticket){
        hm.put(ticket.getId(),ticket);
        return ticket;
    }

    public Optional<Ticket> getTicketById(Long ticketId){
        if(hm.containsKey(ticketId)){
            return Optional.of(hm.get(ticketId));
        }
        return Optional.empty();
    }

    public void removeTicket(Long ticketId){
        hm.remove(ticketId);
    }
}
