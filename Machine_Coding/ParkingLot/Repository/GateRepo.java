package Machine_Coding.ParkingLot.Repository;

import java.util.HashMap;
import java.util.Optional;

import Machine_Coding.ParkingLot.Model.Gate;

public class GateRepo {
    HashMap<Long,Gate> hm = new HashMap<>();
    public Gate save(Gate gate){
        hm.put(gate.getId(),gate);
        return gate;
    }

    public Optional<Gate> findGateById(Long id){
        if(hm.containsKey(id)){
            return Optional.of(hm.get(id));
        }
        return Optional.empty();
    }
}
