package Decorator;

public class Client {
    public static void main(String[] args) {
        PlainCoffee pcoffee = new PlainCoffee();
        System.out.println("plain coffee desc "+pcoffee.getDescription() + " Cost: " + pcoffee.getCost());

        MilkDecorator milkCoffee = new MilkDecorator(pcoffee);
        System.out.println("milk coffee desc "+milkCoffee.getDescription() + " Cost: " + milkCoffee.getCost());

        SugarDecorator sugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("sugar coffee desc "+sugarCoffee.getDescription() + " Cost: " + sugarCoffee.getCost());

        SugarDecorator sugarCoffee2 = new SugarDecorator(pcoffee);
        System.out.println("sugar coffee2 desc without milk"+sugarCoffee2.getDescription() + " Cost: " + sugarCoffee2.getCost());
    }
}
