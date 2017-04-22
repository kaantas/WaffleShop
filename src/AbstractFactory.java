import Beverage.Beverage;
import Waffle.Waffle;

public abstract class AbstractFactory {
    public abstract Beverage makeBeverage(String beverageType);

    public abstract Waffle makeWaffle(String waffleType);
}
