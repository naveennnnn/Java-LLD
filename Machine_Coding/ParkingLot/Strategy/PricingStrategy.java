package Machine_Coding.ParkingLot.Strategy;

public interface PricingStrategy {
    double calculatePrice(long days,long hours,long min,long sec);
}
