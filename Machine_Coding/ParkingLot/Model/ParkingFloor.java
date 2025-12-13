package Machine_Coding.ParkingLot.Model;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private List<ParkingSpot> parkingSpots;
    private String name;

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
