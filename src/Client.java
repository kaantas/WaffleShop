
public class Client {
    public static void main(String[] args) {
        String[] chocoList = {"White"};
        String[] fruitList = {"Banana","Strawberry"};
        String[] condimentList = {"IceCream","Almond"};

        Waitress waitress = new Waitress();
        Cook cook = new Cook();

        WaffleOrder waffleOrder = new WaffleOrder(cook, "Square Waffle", chocoList, fruitList, condimentList);
        waitress.takeOrder(waffleOrder);

        BeverageOrder beverageOrder = new BeverageOrder(cook, "Tea");
        waitress.takeOrder(beverageOrder);

    }
}
