
public class Client {
    public static void main(String[] args) {
        String[] chocoList = {"White"};
        String[] fruitList = {"Banana","Strawberry"};
        String[] condimentList = {"IceCream","Almond"};
        Waitress waitress = new Waitress();
        Cook cook = new Cook();
        SquareWaffleOrder waffleOrder = new SquareWaffleOrder(cook, chocoList, fruitList, condimentList);
        waitress.takeOrder(waffleOrder);
    }
}
