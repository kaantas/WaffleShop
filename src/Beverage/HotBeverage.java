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
        System.out.println("Su kaynatılıyor.");
    }

    public abstract void brew();

    public void pourInCup(){
        System.out.println("Bardağa konuluyor.");
    }

    public abstract void addCondiment();

    boolean customerWantsCondiment(){
        return true;
    }
}
