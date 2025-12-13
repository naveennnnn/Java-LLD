package Machine_Coding.ParkingLot.Model;
public class BaseModel {
    protected long id;
    protected String createdAt;
    protected String lastModifiedAt;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }    
}
