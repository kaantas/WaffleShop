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
            System.out.println("Ne siparişi vermek istersiniz?");
            System.out.println("(1) Waffle");
            System.out.println("(2) İçecek");
            System.out.println("(Other) Sipariş vermeyi tamamladım.");

            int a = scanner.nextInt();
            if(a==1) {
                ArrayList<String> chocoList = new ArrayList<>();
                ArrayList<String> fruitList = new ArrayList<>();
                ArrayList<String> condimentList = new ArrayList<>();

                String waffleType = null;
                String answer = null;

                while (true) {
                    System.out.println("Hangi waffle'i istersiniz?");
                    System.out.println("(1) Square Waffle");
                    System.out.println("(2) Circle Waffle");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        answer = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (answer.equals("1")) {
                        waffleType = "Square Waffle";
                        System.out.println("*** Square Waffle seçildi.");
                        break;
                    } else if (answer.equals("2")) {
                        waffleType = "Circle Waffle";
                        System.out.println("*** Circle Waffle seçildi.");
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("");

                System.out.println("-------------------- MALZEMELERİ SEÇİNİZ --------------------");
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Çikolata Çeşitleri --------------------");
                    System.out.println("(1) Beyaz Çikolata");
                    System.out.println("(2) Normal Çikolata");
                    System.out.println("(0) Çikolata seçimini tamamladım.");

                    int value = scan.nextInt();
                    if (value == 1) {
                        chocoList.add("White");
                        System.out.println("*** Beyaz Çikolata seçildi.");
                    } else if (value == 2) {
                        chocoList.add("Normal");
                        System.out.println("*** Çikolata seçildi.");
                    } else break;
                }
                System.out.println("Çikolata seçimi tamamlandı.");
                System.out.println("");

                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Meyve Çeşitleri --------------------");
                    System.out.println("(1) Muz");
                    System.out.println("(2) Çilek");
                    System.out.println("(3) Kivi");
                    System.out.println("(0) Meyve seçimini tamamladım.");
                    int value = scan2.nextInt();
                    if (value == 1) {
                        fruitList.add("Banana");
                        System.out.println("*** Banana seçildi.");
                    } else if (value == 2) {
                        fruitList.add("Strawberry");
                        System.out.println("*** Strawberry seçildi.");
                    } else if (value == 3) {
                        fruitList.add("Kiwi");
                        System.out.println("*** Kiwi seçildi.");
                    } else break;
                }
                System.out.println("Meyve seçimi tamamlandı.");
                System.out.println("");

                Scanner scan3 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Condiment Çeşitleri --------------------");
                    System.out.println("(1) Dondurma");
                    System.out.println("(2) Hindistan");
                    System.out.println("(3) Badem");
                    System.out.println("(0) Condiment seçimini tamamladım.");
                    int value = scan3.nextInt();
                    if (value == 1) {
                        condimentList.add("Ice Cream");
                        System.out.println("*** Ice Cream seçildi.");
                    } else if (value == 2) {
                        fruitList.add("Coconut");
                        System.out.println("*** Coconut seçildi.");
                    } else if (value == 3) {
                        fruitList.add("Almond");
                        System.out.println("*** Almond seçildi.");
                    } else break;
                }
                System.out.println("Condiment seçimi tamamlandı.");
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
                System.out.println("-------------------- İÇECEK SEÇİNİZ --------------------");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- İçecek Çeşitleri --------------------");
                    System.out.println("(1) Tea");
                    System.out.println("(2) Coffee");
                    System.out.println("(3) Cola");
                    System.out.println("(4) Ice Tea");
                    System.out.println("(5) Fanta");
                    System.out.println("(6) Sprite");
                    System.out.println("(0) İçecek seçimini tamamladım.");
                    int drink = scanBeverage.nextInt();
                    if(drink==1){
                        beverageType="Tea";
                        System.out.println("Tea seçildi.");
                    }
                    else if(drink==2){
                        beverageType="Coffee";
                        System.out.println("Coffee seçildi.");
                    }
                    else if(drink==3){
                        beverageType="Cola";
                        System.out.println("Cola seçildi.");
                    }
                    else if(drink==4){
                        beverageType="Ice Tea";
                        System.out.println("Ice Tea seçildi.");
                    }
                    else if(drink==5){
                        beverageType="Fanta";
                        System.out.println("Fanta seçildi.");
                    }
                    else if(drink==6){
                        beverageType="Sprite";
                        System.out.println("Sprite seçildi.");
                    }
                    else{
                        break;
                    }
                }
                System.out.println("İçecek seçimi tamamlandı.");
                System.out.println("");

                BeverageOrder beverageOrder = new BeverageOrder(cook, beverageType);
                waitress.takeOrder(beverageOrder);
            }

            else{
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("AFİYET OLSUN");
                System.out.println("");
                break;
            }
        }
    }
}
