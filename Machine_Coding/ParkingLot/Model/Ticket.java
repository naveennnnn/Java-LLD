package Machine_Coding.ParkingLot.Model;
import java.time.Instant;

import Machine_Coding.ParkingLot.Strategy.PricingStrategy;
public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private Instant entryTime;
    private Long gateId;
    private PricingStrategy pricingStrategy;
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
    public Long getGateId() {
        return gateId;
    }
    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }
    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    } 

    
}
