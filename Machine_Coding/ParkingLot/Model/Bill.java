package Machine_Coding.ParkingLot.Model;

import java.time.Instant;
public class Bill extends BaseModel {
    private Long ticketId;
    private Instant ExitTime;
    private long GateId;
    private Double price;
    public Long getTicketId() {
        return ticketId;
    }
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }
    public Instant getExitTime() {
        return ExitTime;
    }
    public void setExitTime(Instant exitTime) {
        ExitTime = exitTime;
    }
    public long getGateId() {
        return GateId;
    }
    public void setGateId(long gateId) {
        GateId = gateId;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    
}
