
public class BeverageOrder implements Command{
    Cook cook;

    public BeverageOrder(Cook cook){
        this.cook = cook;
    }

    @Override
    public void orderUp() {
        cook.getOrder("");
    }
}
