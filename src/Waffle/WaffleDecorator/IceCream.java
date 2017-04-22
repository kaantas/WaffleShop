package Waffle.WaffleDecorator;

import Waffle.Waffle;

public class IceCream extends CondimentDecorator {
    Waffle waffle;

    public IceCream(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 2.5 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Ice Cream";
    }
}
