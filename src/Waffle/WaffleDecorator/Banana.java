package Waffle.WaffleDecorator;

import Waffle.Waffle;

public class Banana extends FruitDecorator{
    Waffle waffle;

    public Banana(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 0.75 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Banana";
    }
}
