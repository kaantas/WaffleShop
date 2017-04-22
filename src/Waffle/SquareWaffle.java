//Concrete Component

package Waffle;

public class SquareWaffle extends Waffle {
    public SquareWaffle(){
        description = "Square Waffle";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
