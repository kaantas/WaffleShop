package Waffle.WaffleDecorator;


import Waffle.Waffle;

public class Coconut extends CondimentDecorator{
    Waffle waffle;

    public Coconut(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 0.10 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Coconut";
    }
}
