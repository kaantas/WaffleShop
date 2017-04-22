
public class BeverageOrder implements Command{
    Cook cook;
    String order;
    public BeverageOrder(Cook cook, String order){
        this.cook = cook;
        this.order= order;
    }

    @Override
    public void orderUp() {
        cook.beverageType = order;
        cook.getOrder("Beverage");
    }
}
