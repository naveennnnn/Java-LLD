package Machine_Coding.ParkingLot.Model;
public class ParkingSpot extends BaseModel{
    private VehicleType supportedVehicleType;
    private long floorId;
    
    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }
    public void setSupportedVehicleType(VehicleType supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }
    public long getFloorId() {
        return floorId;
    }
    public void setFloorId(long floorId) {
        this.floorId = floorId;
    }

    
}
