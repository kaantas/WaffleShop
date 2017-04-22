// Component

package Waffle;

public abstract class Waffle {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareDough(String type) {
        System.out.println(type + " hamuru hazırlanıyor.");
    }

    public void cookDough(String type) {
        System.out.println(type + " hamuru pişiriliyor.");
    }

    public void dishUp(String type) {
        System.out.println(type + " tabağa konuldu.");
    }
}
