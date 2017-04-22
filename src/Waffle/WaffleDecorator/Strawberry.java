package Waffle.WaffleDecorator;

import Waffle.Waffle;

public class Strawberry extends FruitDecorator {
    Waffle waffle;

    public Strawberry(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 0.60 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Strawberry";
    }
}
