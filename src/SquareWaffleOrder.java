
public class SquareWaffleOrder implements Command{
    Cook cook;
    String[] chocoList, fruitList, condimentList;
    public SquareWaffleOrder(Cook cook, String[] chocoList, String[] fruitList, String[] condimentList){
        this.cook = cook;
        this.chocoList = chocoList;
        this.fruitList = fruitList;
        this.condimentList = condimentList;
    }

    @Override
    public void orderUp() {
        cook.waffleType = "Square Waffle";
        cook.chocoList = this.chocoList;
        cook.fruitList = this.fruitList;
        cook.condimentList = this.condimentList;
        cook.getOrder("Waffle");

    }
}
