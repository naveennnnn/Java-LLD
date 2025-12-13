package Machine_Coding.ParkingLot.dto;

import java.time.Instant;
import Machine_Coding.ParkingLot.Model.Vehicle;

public class TicketResponseDto {
    public long id;
    public Vehicle vehicle;
    public Instant entryTime;
    public long gateId;
    public double price;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Instant getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(Instant entryTime) {
        this.entryTime = entryTime;
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

    

}
