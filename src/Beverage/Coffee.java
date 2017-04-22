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
        return "Kahve";
    }

    @Override
    public void brew() {
        System.out.println("Kahve hazırlanıyor.");
    }

    @Override
    public void addCondiment() {
        System.out.println("Süt ve şeker ekleniyor.");
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
        System.out.println("Süt ister misiniz? (y/n)");

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
