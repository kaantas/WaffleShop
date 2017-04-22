import Waffle.Waffle;
import Waffle.WaffleDecorator.*;
import Waffle.WaffleDecorator.NormalChocolate;
import Waffle.WaffleDecorator.Strawberry;
import Waffle.WaffleDecorator.WhiteChocolate;

// Receiver
public class Cook {
    public static String waffleType="";
    public static String[] chocoList = null;
    public static String[] fruitList = null;
    public static String[] condimentList = null;
    AbstractFactory factory;
    Waffle waffle;

    public Waffle getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Waffle")){
            factory =  new WaffleFactory();
            waffle = factory.makeWaffle(waffleType);
            waffle = decorate(chocoList, fruitList, condimentList);
            System.out.println(waffle.getDescription() + " siparisi tamamlandı.");
            System.out.println("Cost: $" + waffle.cost());
        }
        /*
        else if(choice.equalsIgnoreCase("Beverage")){
            return new BeverageFactory();
        }*/
        return waffle;
    }

    public Waffle decorate(String[] chocoList, String[] fruitList, String[] condimentList){
        for (int i = 0; i < chocoList.length; i++) {
            String choco = chocoList[i];
            if(choco.equals("White")){
                waffle = new WhiteChocolate(waffle);
            }
            else if(choco.equals("Normal")){
                waffle = new NormalChocolate(waffle);
            }
        }

        for (int i = 0; i < fruitList.length; i++) {
            String fruit = fruitList[i];
            if(fruit.equals("Banana")){
                waffle = new Banana(waffle);
            }
            else if(fruit.equals("Strawberry")){
                waffle = new Strawberry(waffle);
            }
            else if(fruit.equals("Kiwi")){
                waffle = new Kiwi(waffle);
            }
        }

        for (int i = 0; i < condimentList.length; i++) {
            String condiment = condimentList[i];
            if(condiment.equals("Almond")){
                waffle = new Almond(waffle);
            }
            else if(condiment.equals("Coconut")){
                waffle = new Coconut(waffle);
            }
            else if(condiment.equals("Ice Cream")){
                waffle = new IceCream(waffle);
            }
        }

        return waffle;
    }
}
