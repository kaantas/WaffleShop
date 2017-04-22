package Beverage;

public class Sprite extends ColdBeverage{
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Sprite";
    }
}
