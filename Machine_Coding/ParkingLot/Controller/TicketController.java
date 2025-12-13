package Machine_Coding.ParkingLot.Controller;


import Machine_Coding.ParkingLot.Model.Ticket;
import Machine_Coding.ParkingLot.Service.TicketService;
import Machine_Coding.ParkingLot.dto.TicketRequestDto;
import Machine_Coding.ParkingLot.dto.TicketResponseDto;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    /**
     * 
     * createTicket
     * 
     *
     * 
    */

    public TicketResponseDto createTicket(TicketRequestDto ticketRequestDto){
        Ticket ticket = ticketService.createTicket(ticketRequestDto.getVehicle(),ticketRequestDto.getGateId(),ticketRequestDto.getPricingStrategy());
        TicketResponseDto response = new TicketResponseDto();
        response.setEntryTime(ticket.getEntryTime());
        response.setGateId(ticket.getGateId());
        response.setVehicle(ticket.getVehicle());
        response.setId(ticket.getId());
        return response;
    }
}
