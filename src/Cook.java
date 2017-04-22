import Beverage.Beverage;
import Waffle.Waffle;
import Waffle.WaffleDecorator.*;
import Waffle.WaffleDecorator.NormalChocolate;
import Waffle.WaffleDecorator.Strawberry;
import Waffle.WaffleDecorator.WhiteChocolate;

// Receiver
public class Cook {
    public static String waffleType="";
    public static String beverageType="";
    public static String[] chocoList = null;
    public static String[] fruitList = null;
    public static String[] condimentList = null;
    Waffle waffle;
    Beverage beverage;
    public void getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Waffle")){
            System.out.println(waffleType + " order received.");

            WaffleFactory factory =  new WaffleFactory();
            waffle = factory.makeWaffle(waffleType);

            waffle.prepareDough(waffleType);
            waffle.cookDough(waffleType);
            waffle.dishUp(waffleType);
            waffle = decorate(chocoList, fruitList, condimentList);

            System.out.println(waffle.getDescription() + " order completed.");
            System.out.println("Cost: $" + waffle.cost());

        }
        else if(factoryType.equalsIgnoreCase("Beverage")){
            System.out.println(beverageType + " order received.");

            BeverageFactory factory = new BeverageFactory();
            beverage = factory.makeBeverage(beverageType);
            beverage.prepareBeverage();

            System.out.println(beverage.getDescription() + " order completed.");
            System.out.println("Cost: $" + beverage.cost());
        }
        System.out.println("");
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
