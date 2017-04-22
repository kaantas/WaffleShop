import Waffle.*;

public class WaffleFactory {

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

}
