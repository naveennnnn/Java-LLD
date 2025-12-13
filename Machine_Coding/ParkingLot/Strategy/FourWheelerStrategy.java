package Machine_Coding.ParkingLot.Strategy;

public class FourWheelerStrategy implements PricingStrategy{
    public static int priceForFirst3Hour;
    public static int priceForExtraHour;
    
    @Override
    public double calculatePrice(long days, long hours, long min, long sec) {
        double total = 0d;
        long totalHours = days*24 + hours;
        total += priceForFirst3Hour;

        if(totalHours>3){
            total += (totalHours-3)*priceForExtraHour;
        }
        if(min != 0 && totalHours>=3){
            total += min * (double)priceForExtraHour/60;
        }
        if(sec != 0 && totalHours>=3){
            total += sec *(double) priceForExtraHour/3600;
        }
        return total;
    }

    public static int getPriceForFirst3Hour() {
        return priceForFirst3Hour;
    }

    public static void setPriceForFirst3Hour(int priceForFirst3Hour) {
        FourWheelerStrategy.priceForFirst3Hour = priceForFirst3Hour;
    }

    public static int getPriceForExtraHour() {
        return priceForExtraHour;
    }

    public static void setPriceForExtraHour(int priceForExtraHour) {
        FourWheelerStrategy.priceForExtraHour = priceForExtraHour;
    }
}
