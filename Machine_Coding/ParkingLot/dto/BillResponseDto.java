package Machine_Coding.ParkingLot.dto;
import java.time.Instant;

import Machine_Coding.ParkingLot.Model.BillStatus;

public class BillResponseDto {
    public long id;
    public long ticketId;
    public Instant exitTIme;
    public long gateId;
    public double price;
    public BillStatus billStatus;

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getTicketId() {
        return ticketId;
    }
    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }
    public Instant getExitTIme() {
        return exitTIme;
    }
    public void setExitTIme(Instant exitTIme) {
        this.exitTIme = exitTIme;
    }
    public long getGateId() {
        return gateId;
    }
    public void setGateId(long gateId) {
        this.gateId = gateId;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public BillStatus getBillStatus() {
        return billStatus;
    }
    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
