package Machine_Coding.ParkingLot.dto;

import Machine_Coding.ParkingLot.Model.Vehicle;
import Machine_Coding.ParkingLot.Strategy.PricingStrategy;

public class TicketRequestDto {
    public Vehicle vehicle;
    public long gateId;
    public PricingStrategy pricingStrategy;
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public long getGateId() {
        return gateId;
    }
    public void setGateId(long gateId) {
        this.gateId = gateId;
    }
    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }
    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    
}
