package Waffle.WaffleDecorator;

import Waffle.Waffle;

public class WhiteChocolate extends ChocolateDecorator {
    Waffle waffle;

    public WhiteChocolate(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 1.50 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", White Chocolate";
    }
}
