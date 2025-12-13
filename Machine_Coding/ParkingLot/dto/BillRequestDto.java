package Machine_Coding.ParkingLot.dto;

public class BillRequestDto {
    public long ticketId;
    public long gateId;
    public long getTicketId() {
        return ticketId;
    }
    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }
    public long getGateId() {
        return gateId;
    }
    public void setGateId(long gateId) {
        this.gateId = gateId;
    }

    
}
