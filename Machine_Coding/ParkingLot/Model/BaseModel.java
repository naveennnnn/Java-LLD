package Machine_Coding.ParkingLot.Model;

import java.util.concurrent.atomic.AtomicInteger;
import java.time.Instant;
public class BaseModel {
    private static final AtomicInteger counter = new AtomicInteger(0);
    protected long id;
    protected Instant createdAt;
    protected Instant lastModifiedAt;

    public BaseModel(){
        id = counter.incrementAndGet();
        createdAt = Instant.now();
        lastModifiedAt = Instant.now();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }    
}
