package Machine_Coding.ParkingLot.Model;
public class Gate extends BaseModel{
    private long floorId;
    private GateType gateType;

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
    public GateType getGateType() {
        return gateType;
    }
    public long getFloorId() {
        return floorId;
    }
    public void setFloorId(long floorId) {
        this.floorId = floorId;
    }
    
}
