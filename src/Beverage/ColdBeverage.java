package Beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ColdBeverage implements Beverage{
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void prepareBeverage() {
        uncoverBeverage();
        pourInGlass();
        putPipet();

        if(customerWantsIce()) {
            addIce();
        }
    }

    public void uncoverBeverage(){
        System.out.println("Uncovering the bottle of drink");
    }

    public void pourInGlass(){
        System.out.println("Pouring into glass");
    }

    public void putPipet(){
        System.out.println("Put pipet in glass");
    }

    public void addIce(){
        System.out.println("Adding ice");
    }

    //hook
    public boolean customerWantsIce(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like ice? (y/n)");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(answer == null){
            answer = "no";
        }

        return answer;
    }
}
