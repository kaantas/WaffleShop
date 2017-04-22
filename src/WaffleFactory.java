import Beverage.Beverage;
import Waffle.*;

public class WaffleFactory extends AbstractFactory {
    @Override
    public Waffle makeWaffle(String waffleType) {
        System.out.println("Waffle siparişi alındı.");
        System.out.println("Waffle hamuru hazırlanıyor.");
        System.out.println("Waffle hamuru pişiriliyor.");
        System.out.println("Waffle hamuru tabağa konuldu.");

        if (waffleType.equals(null)){
            return null;
        }
        else if(waffleType.equals("Square Waffle")){
            System.out.println("Square Waffle hazırlandı.");
            System.out.println("Square Waffle dekore ediliyor.");
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
