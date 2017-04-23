package Beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends HotBeverage{
    double cost = 5.5;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding milk");
    }

    //hook
    public boolean customerWantsCondiment(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost + 1.5;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk? --- 1.5$ (y/n)");

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
