package Waffle.WaffleDecorator;

import Waffle.Waffle;

public class NormalChocolate extends ChocolateDecorator{
    Waffle waffle;

    public NormalChocolate(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 1.25 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Chocolate";
    }
}
