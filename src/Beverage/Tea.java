package Beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends HotBeverage{
    double cost = 2.5;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding lemon");
    }

    //hook
    public boolean customerWantsCondiment(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost + 0.5;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like lemon? --- 0.5$ (y/n)");

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
