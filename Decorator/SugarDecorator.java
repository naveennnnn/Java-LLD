package Decorator;

public class SugarDecorator extends CoffeeDecorator{
    
    public SugarDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }

    public String getDescription(){
        return super.getDescription() + ", with Sugar";
    }

    public double getCost(){
        return super.getCost() + 0.5;
    }
}
