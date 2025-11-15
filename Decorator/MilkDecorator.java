package Decorator;

public class MilkDecorator extends CoffeeDecorator{
    
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Milk";
        // return decoratedCoffee.getDescription() + ", with Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
        // return decoratedCoffee.getCost() + 1.5;
    }
}
