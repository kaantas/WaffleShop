//Concrete Component

package Waffle;

public class CircleWaffle extends Waffle {
    public  CircleWaffle(){
        description = "Circle Waffle";
    }

    @Override
    public double cost() {
        return 4.00;
    }
}
