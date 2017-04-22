package Beverage;

public abstract class HotBeverage implements Beverage {
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiment()) {
            addCondiment();
        }
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public abstract void brew();

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public abstract void addCondiment();

    boolean customerWantsCondiment(){
        return true;
    }
}
