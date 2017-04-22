package Beverage;

public class Fanta extends ColdBeverage {
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Fanta";
    }
}
