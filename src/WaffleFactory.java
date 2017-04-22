import Beverage.Beverage;
import Waffle.*;

public class WaffleFactory extends AbstractFactory {
    @Override
    public Waffle makeWaffle(String waffleType) {
        if (waffleType.equals(null)){
            return null;
        }
        else if(waffleType.equals("Square Waffle")){
            return new SquareWaffle();
        }
        else if(waffleType.equals("Circle Waffle")){
            return new CircleWaffle();
        }
        return null;
    }

    @Override
    public Beverage makeBeverage(String beverageType) {
        return null;
    }
}
