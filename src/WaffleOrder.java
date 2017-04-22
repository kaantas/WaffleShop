
public class WaffleOrder implements Command{
    Cook cook;
    String[] chocoList, fruitList, condimentList;
    String order;
    public WaffleOrder(Cook cook, String order, String[] chocoList, String[] fruitList, String[] condimentList){
        this.cook = cook;
        this.order = order;
        this.chocoList = chocoList;
        this.fruitList = fruitList;
        this.condimentList = condimentList;
    }

    @Override
    public void orderUp() {
        cook.waffleType = order;
        cook.chocoList = this.chocoList;
        cook.fruitList = this.fruitList;
        cook.condimentList = this.condimentList;
        cook.getOrder("Waffle");
    }
}
