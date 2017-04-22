import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static String beverageType="";
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        Cook cook = new Cook();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to order?");
            System.out.println("(1) Waffle");
            System.out.println("(2) Drink");
            System.out.println("(Other) I have finished ordering.");

            int a = scanner.nextInt();
            if(a==1) {
                ArrayList<String> chocoList = new ArrayList<>();
                ArrayList<String> fruitList = new ArrayList<>();
                ArrayList<String> condimentList = new ArrayList<>();

                String waffleType = null;
                String answer = null;

                while (true) {
                    System.out.println("Which waffle do you want?");
                    System.out.println("(1) Square Waffle");
                    System.out.println("(2) Circular Waffle");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        answer = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (answer.equals("1")) {
                        waffleType = "Square Waffle";
                        System.out.println("*** Square Waffle is chosen.");
                        break;
                    } else if (answer.equals("2")) {
                        waffleType = "Circle Waffle";
                        System.out.println("*** Circular Waffle is chosen.");
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("");

                System.out.println("-------------------- INGREDIENTS --------------------");
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Chocolate Types --------------------");
                    System.out.println("(1) White Chocolate");
                    System.out.println("(2) Nutella");
                    System.out.println("(Other) I finished the chocolate selection.");

                    int value = scan.nextInt();
                    if (value == 1) {
                        chocoList.add("White");
                        System.out.println("*** White Chocolate is chosen.");
                    } else if (value == 2) {
                        chocoList.add("Normal");
                        System.out.println("*** Nutella is chosen.");
                    } else break;
                }
                System.out.println("The selection of chocolates is completed.");
                System.out.println("");

                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Fruit Types --------------------");
                    System.out.println("(1) Banana");
                    System.out.println("(2) Strawberry");
                    System.out.println("(3) Kiwi");
                    System.out.println("(Other) I finished the fruit selection.");
                    int value = scan2.nextInt();
                    if (value == 1) {
                        fruitList.add("Banana");
                        System.out.println("*** Banana is chosen.");
                    } else if (value == 2) {
                        fruitList.add("Strawberry");
                        System.out.println("*** Strawberry is chosen.");
                    } else if (value == 3) {
                        fruitList.add("Kiwi");
                        System.out.println("*** Kiwi is chosen.");
                    } else break;
                }
                System.out.println("The selection of fruits is completed.");
                System.out.println("");

                Scanner scan3 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Condiment Types --------------------");
                    System.out.println("(1) Ice Cream");
                    System.out.println("(2) Coconut");
                    System.out.println("(3) Almond");
                    System.out.println("(Other) I finished the codniment selection.");
                    int value = scan3.nextInt();
                    if (value == 1) {
                        condimentList.add("Ice Cream");
                        System.out.println("*** Ice Cream is chosen.");
                    } else if (value == 2) {
                        fruitList.add("Coconut");
                        System.out.println("*** Coconut is chosen.");
                    } else if (value == 3) {
                        fruitList.add("Almond");
                        System.out.println("*** Almond is chosen.");
                    } else break;
                }
                System.out.println("The selection of condiments is completed.");
                System.out.println("");

                String[] chocoArr = new String[chocoList.size()];
                chocoArr = chocoList.toArray(chocoArr);

                String[] fruitArr = new String[fruitList.size()];
                fruitArr = fruitList.toArray(fruitArr);

                String[] condimentArr = new String[condimentList.size()];
                condimentArr = condimentList.toArray(condimentArr);

                WaffleOrder waffleOrder = new WaffleOrder(cook, waffleType, chocoArr, fruitArr, condimentArr);
                waitress.takeOrder(waffleOrder);
            }

            else if(a==2) {
                Scanner scanBeverage = new Scanner(System.in);
                System.out.println("-------------------- DRINKS --------------------");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- Drink Types --------------------");
                    System.out.println("(1) Tea");
                    System.out.println("(2) Coffee");
                    System.out.println("(3) Cola");
                    System.out.println("(4) Ice Tea");
                    System.out.println("(5) Fanta");
                    System.out.println("(6) Sprite");
                    System.out.println("(Other) I finished the drink selection.");
                    int drink = scanBeverage.nextInt();
                    if(drink==1){
                        beverageType="Tea";
                        System.out.println("*** Tea is chosen.");
                    }
                    else if(drink==2){
                        beverageType="Coffee";
                        System.out.println("*** Coffee is chosen.");
                    }
                    else if(drink==3){
                        beverageType="Cola";
                        System.out.println("*** Cola is chosen.");
                    }
                    else if(drink==4){
                        beverageType="Ice Tea";
                        System.out.println("*** Ice Tea is chosen.");
                    }
                    else if(drink==5){
                        beverageType="Fanta";
                        System.out.println("*** Fanta is chosen.");
                    }
                    else if(drink==6){
                        beverageType="Sprite";
                        System.out.println("*** Sprite is chosen.");
                    }
                    else{
                        break;
                    }
                }
                System.out.println("The selection of drinks is completed.");
                System.out.println("");

                BeverageOrder beverageOrder = new BeverageOrder(cook, beverageType);
                waitress.takeOrder(beverageOrder);
            }

            else{
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("BON APPETIT");
                System.out.println("");
                break;
            }
        }
    }
}
