import java.util.Scanner;

public class razni {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        double totalMoney = 20;

        double cheese = 15.0;
        double onion = 3.0;
        double tomato = 7.0;
        double cucumber = 6.0;
        double peppers = 5.0;

        double quantityOfCheese = 0;
        double quantityOfOnion = 0;
        double quantityOfTomato = 0;
        double quantityOfCucumber = 0;
        double quantityOfPeppers = 0;

        String command = "";
        double quantity = 0;
        double totalPriceForVegetable = 0;

        do {
            System.out.println("Hello we sell Cheese,peppers,onions,cucumbers,tomato's what would u like to buy");
            command = scanner.nextLine();


            if (command.equalsIgnoreCase("cheese")) {
                System.out.println("Enter the quantity of cheese u want to buy");
                quantity = scanner.nextDouble();
                totalPriceForVegetable = (quantity * cheese);
                totalMoney -= totalPriceForVegetable;
                quantityOfCheese += quantity;

            } else if (command.equalsIgnoreCase("onion")) {
                System.out.println("Enter the quantity of onion u want to buy");
                quantity = scanner.nextDouble();
                totalPriceForVegetable = (quantity * onion);
                totalMoney -= totalPriceForVegetable;
                quantityOfOnion += quantity;

            } else if (command.equalsIgnoreCase("tomato")) {
                System.out.println("Enter the quantity of tomato's u want to buy");
                quantity = scanner.nextDouble();
                totalPriceForVegetable = (quantity * tomato);
                totalMoney -= totalPriceForVegetable;
                quantityOfTomato += quantity;

            } else if (command.equalsIgnoreCase("cucumber")) {
                System.out.println("Enter the quantity of cucumbers u want to buy");
                quantity = scanner.nextDouble();
                totalPriceForVegetable = (quantity * cucumber);
                totalMoney -= totalPriceForVegetable;
                quantityOfCucumber += quantity;

            } else if (command.equalsIgnoreCase("peppers")) {
                System.out.println("Enter the quantity of peppers u want to buy");
                quantity = scanner.nextDouble();
                totalPriceForVegetable = (quantity * peppers);
                totalMoney -= totalPriceForVegetable;
                quantityOfPeppers += quantity;

            }
            if (totalMoney <= 0 ){
                System.out.println("You don't have enough money");
                break;
            }




            double canBuyCheese = totalMoney / cheese;
            double canBuyOnion = totalMoney / onion;
            double canBuyTomato = totalMoney / tomato;
            double canBuyCucumber = totalMoney / cucumber;
            double canBuyPeppers = totalMoney / peppers;

            System.out.println("You have " + totalMoney +"lv. left u can buy ");
            System.out.printf("%.3f kilograms of cheese\n", canBuyCheese);
            System.out.printf("%.3f kilograms of onion\n", canBuyOnion);
            System.out.printf("%.3f kilograms of tomato\n", canBuyTomato);
            System.out.printf("%.3f kilograms of cucumber\n", canBuyCucumber);
            System.out.printf("%.3f kilograms of peppers\n", canBuyPeppers);


        } while (!command.equalsIgnoreCase("Stop"));

        System.out.printf("\n%.3f you bought kilograms of cheese\n", quantityOfCheese);
        System.out.printf("%.3f you bought kilograms of onion\n", quantityOfOnion);
        System.out.printf("%.3f you bought kilograms of tomato\n", quantityOfTomato);
        System.out.printf("%.3f  you bought kilograms of cucumber\n", quantityOfCucumber);
        System.out.printf("%.3f you bought kilograms of peppers\n", quantityOfPeppers);
        System.out.println("You have " + Math.round(totalMoney) + "lv. left and you can make " +
                (quantityOfCheese + quantityOfCucumber +quantityOfOnion +quantityOfPeppers +quantityOfTomato)
                + " Kilograms of traditional salad");
    }
}


