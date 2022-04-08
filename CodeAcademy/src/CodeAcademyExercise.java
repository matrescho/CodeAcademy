import java.util.Locale;
import java.util.Scanner;

public class CodeAcademyExercise {

    public static void vowels () {


        /*▪ Ȁрябва да си купите нови маратонки. Оглеждате офертите, но имате
няколко изисквания:
1. Цената им не трябва да е над 150 лв.;
2. Ȁрябва да са размер 44 или 45;
3. Ȁрябва да не са черни;
4. Ȁрябва задължително да можете да ги върнете;
▪ Напишете проверка с IF-ELSE която да отразява всички условия.



     */
       Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < 100000) {
            i++;
            System.out.println("Enter a Character");
            String letter = scanner.nextLine().toLowerCase(Locale.ROOT);

            boolean vowels = letter.equals("a") || letter.equals("e") || letter.equals("i") ||
                    letter.equals("o") || letter.equals("u");


            if (letter.length() == 1 && vowels) {
                System.out.println("The letter " + letter + " is a vowel ");
            } else if (letter.length() == 1 && !vowels) {
                System.out.println("The letter  " + letter + " is not a vowel");
            } else if (letter.length() != 1 && !"stop".equals(letter)) {
                System.out.println("Invalid Input");
            } else if (letter.equals("stop")) {
                break;
            }

        }
    }

    public static void shoes () {

        /*Задача 1
▪ Ȁрябва да си купите нови маратонки. Оглеждате офертите, но имате
няколко изисквания:
1. Цената им не трябва да е над 150 лв.;
2. Ȁрябва да са размер 44 или 45;
3. Ȁрябва да не са черни;
4. Ȁрябва задължително да можете да ги върнете;
▪ Напишете проверка с IF-ELSE която да отразява всички условия.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Can we return the shoes yes or no");
        String returnYesOrNo = scanner.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("Enter color");
        String color = scanner.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("Enter price");
        double price = scanner.nextDouble();


        System.out.println("Enter size");
        int size = scanner.nextInt();


       // int conditions = 0;
        boolean return1 = returnYesOrNo.equals("yes");

        if (return1 && color.equals("black") && price <= 150 && size == 44 || size == 45) {
            System.out.println("We have the perfect shoes for u");
        } else {
            System.out.println("We cant help u sorry ;(");
        }


       /* if (return1){
            conditions ++;
        }if (color.equals("black")){
            conditions ++;
        }if(price <= 150){
            conditions ++;
        }if (size == 44 || size == 45){
            conditions ++;
        }
        System.out.println(conditions);


        if (conditions == 4){
            System.out.println("We found the perfect shoes for u ");
        }else{
            System.out.println("We could not find the perfect shoes for u");
        }

    }


        */
    }

    public static void leapYear (){

        /*Задача 3
Да напишем Java програма, която да проверява дали
дадена година е високосна. Една година е високосна,
ако:
1. Дели се равномерно на 100
2. Ако се дели на 100, то трябва да се дели и на 400
3. ǿ изключение на това, всички останали години,
делящи се равномерно на 4, са високосни

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();

        boolean isDivisibleOf4 = year % 4 == 0;
        boolean isNotDivisibleOf100 = year % 100 != 0;//До колкото разбрах от чичо гугъл вековете не са високосни години
        boolean isDivisibleOf100And400 = (year % 100 == 0) && (year % 400 == 0);

        if (isDivisibleOf4 && (isNotDivisibleOf100) || isDivisibleOf100And400){
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a leap year");
        }







    }

    public static void golfBalls() {

        //Малко по различно решение

        Scanner scanner = new Scanner(System.in);

        int golfBalls = 20;

        do {


            System.out.println("Enter the number of people playing");
            int numberOfPeople = scanner.nextInt();
            golfBalls -= numberOfPeople;
            System.out.println("You have " + golfBalls + " remaining golfBalls");
            System.out.println("Enter the number of people finished the game");
            int numberOfPeopleFinishedTheGame = scanner.nextInt();
            golfBalls += numberOfPeopleFinishedTheGame;
            System.out.println("You have " +golfBalls + " remaining golfBalls");

        }while (golfBalls >0);
    }

    public static void squareOrRectangle(){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        double length = scanner.nextDouble();
        System.out.println("Enter wight");
        double wight = scanner.nextDouble();


        if (length == wight)
        {
            System.out.println("Square");
        }
        else
        {
            System.out.println("Rectangle");
        }






    }

    public static void grade(){


        Scanner scanner = new Scanner(System.in);

        int grade =scanner.nextInt();


        if (grade <=0 || grade >130){
            System.out.println("Invalid grade");

        }

        if (grade < 25 && grade > 0){
            System.out.println("F");
        }
        else if (grade >=25 && grade <50)
        {
            System.out.println("E");
        }
        else if (grade >= 50 && grade < 60)
        {
            System.out.println("D");
        }
        else if (grade >=60 && grade < 80)
        {
            System.out.println("B");
        }
        else if (grade >= 80 && grade < 130)
        {
            System.out.println("A");
        }
    }

    public static void salaryBonus(){
        Scanner scanner = new Scanner(System.in);

        double bonus = 0;

        System.out.println("Enter the number of years you have been working here");
        int yearsOfWorking = scanner.nextInt();
        System.out.println("Enter your Salary");
        double salary = scanner.nextDouble();

        if (yearsOfWorking > 5 && yearsOfWorking < 10){
            bonus += salary * 0.05;
            System.out.println("You have been working here for "+ yearsOfWorking + " years " + " Your new bonus is " + bonus);
        }else if (yearsOfWorking > 10 && yearsOfWorking < 15){
            bonus += salary * 0.07;
            System.out.println("You have been working here for "+ yearsOfWorking + " years " + " Your new bonus is " + bonus);
        }else if (yearsOfWorking > 15){
            bonus += salary * 0.10;
            System.out.println("You have been working here for "+ yearsOfWorking + " years " + " Your new bonus is " + bonus);
        }else {
            System.out.println("Either u haven't worked here long enough for a bonus or your retired ");
        }



    }

    public static void discountForCloths(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter what u want to buy");
        String whatAreYouBuying = scanner.nextLine();
        System.out.println("Enter the Price ");
        double price = scanner.nextDouble();


        if (whatAreYouBuying.equalsIgnoreCase("cloth")){
            System.out.println(price -= price* 0.20);
        }else if (whatAreYouBuying.equalsIgnoreCase("shoe")){
            System.out.println(price -= price * 0.10);
        }else {
            System.out.println(price -= price * 0.05);
        }

        System.out.println("You bought a " + whatAreYouBuying + " for a good price of " + price);

    }

    public static void cinemaTickets(){




        /*4. 7-членно семейство отива на кино. Като двама от тях са пенсионери, двама възрастни,
         един студент и един непълнолетен и едно дете на 11 години.
 Отстъпките в киното:
За пенсионери - 10%
За студенти - 30%
За ученици - 50%
За деца е безплатно (под 7 години)
Колко ще е общата сума която ще плати семейство?

         */

        //Един вариянт на задачката и е точно все едно си на касата задават се 2
        //вида на билета и неговата бройка
        Scanner scanner = new Scanner(System.in);
        String command = "";

        int ticketPrice = 12;
        double totalTicketPrice = 0;
        int numberOfTickets =0;
        int totalTicketsBought = 0;


        while (! command.equalsIgnoreCase("Stop")){

            System.out.println("Enter ticket kind");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("Elderly")){
                System.out.println("Enter number of tickets");
                numberOfTickets = scanner.nextInt();
                totalTicketPrice += (ticketPrice * numberOfTickets) * 0.90;
                totalTicketsBought += numberOfTickets;


            }else if (command.equalsIgnoreCase("collage Student")){
                System.out.println("Enter number of tickets");
                numberOfTickets = scanner.nextInt();
                totalTicketPrice += (ticketPrice * numberOfTickets) * 0.70;
                totalTicketsBought += numberOfTickets;


            }else if (command.equalsIgnoreCase("Students")){
                System.out.println("Enter number of tickets");
                numberOfTickets = scanner.nextInt();
                totalTicketPrice += (ticketPrice * numberOfTickets) * 0.50;
                totalTicketsBought += numberOfTickets;

            }else if (command.equalsIgnoreCase("regular")){
                System.out.println("Enter number of tickets");
                numberOfTickets = scanner.nextInt();
                totalTicketPrice += ticketPrice * numberOfTickets;
                totalTicketsBought += numberOfTickets;

            }else if (command.equalsIgnoreCase("Children")){
                System.out.println("Enter number of tickets");
                numberOfTickets = scanner.nextInt();
                ticketPrice = 0;
                totalTicketsBought += numberOfTickets;
            }

        }

        System.out.printf("You bought " + totalTicketsBought + " tickets for the price of %.2flv.",totalTicketPrice);




    }

    public static void traditionalSalad(){

        /*3. Искате да си направите шопска салата. Трябват ви домати, краставици, лук, чушки, сирене:
Цената на продуктите
Домати - 7лв/кг
Краставици - 6лв/кг
Чушки-5лв/кг
Лук-3лв/кг
Сирене-15лв/кг
Имате 20лв колко салата може да си направите?
//Оцет, олио и сол си имате вкъщи

         */
        Scanner scanner = new Scanner(System.in);
        double totalMoney =20;

        double cheese = 15;
        double onion = 3;
        double tomato = 7;
        double cucumber = 6;
        double peppers = 5;


        //за сега не знам дали е възможно да го използвам в While loop и ако е как точно става..
     //   enum vegetables {

   //      CHEESE(15),
   //      ONION(3),
   //      TOMATO(7),
   //      CUCUMBER(6),
   //      PEPPERS(5);

   //      double price ;
   //      vegetables(double price){
   //          this.price = price;
   //      }

   //  }

        String command = "";


        while (!command.equalsIgnoreCase("stop")){

            String Vegetables;
            double quantity = 0;
            double priceForTheseVegetables = 0;


            System.out.println("\nEnter the vegetable u want to purchase");
            command = scanner.nextLine();

            if (totalMoney <=0){
                break;
            }

            if (command.equalsIgnoreCase("peppers")){
                System.out.println("Enter quantity of peppers");
                quantity = scanner.nextDouble();
                priceForTheseVegetables = (quantity * 5);
                totalMoney -= priceForTheseVegetables;
                System.out.printf("You bought " + quantity + " Of peppers for the price of %.2flv.\nu have %.2flv. left"
                ,priceForTheseVegetables,(totalMoney-priceForTheseVegetables));

            }else if (command.equalsIgnoreCase("cucumber")){
                System.out.println("Enter quantity of cucumber");
                quantity = scanner.nextDouble();
                priceForTheseVegetables = (quantity * 6);
                totalMoney -= priceForTheseVegetables;
                System.out.printf("You bought " + quantity + " Of cucumber for the price of %.2flv.\nu have %.2flv. left"
                        ,priceForTheseVegetables,(totalMoney-priceForTheseVegetables));

            }else if (command.equalsIgnoreCase("onion")){
                System.out.println("Enter quantity of onion");
                quantity = scanner.nextDouble();
                priceForTheseVegetables = (quantity * 3);
                totalMoney -= priceForTheseVegetables;
                System.out.printf("You bought " + quantity + " Of onion for the price of %.2flv.\nu have %.2flv. left"
                        ,priceForTheseVegetables,(totalMoney-priceForTheseVegetables));

            }else if (command.equalsIgnoreCase("tomato")){
                System.out.println("Enter quantity of tomato");
                quantity = scanner.nextDouble();
                priceForTheseVegetables = (quantity * 7);
                totalMoney -= priceForTheseVegetables;
                System.out.printf("You bought " + quantity + " Of tomato for the price of %.2flv.\nu have %.2flv. left"
                        ,priceForTheseVegetables,(totalMoney-priceForTheseVegetables));

            }else if (command.equalsIgnoreCase("cheese")){
                System.out.println("Enter quantity of cheese");
                quantity = scanner.nextDouble();
                priceForTheseVegetables = (quantity * 15);
                totalMoney -= priceForTheseVegetables;
                System.out.printf("You bought " + quantity + " Of cheese for the price of %.2flv.\nu have %.2flv. left"
                        ,priceForTheseVegetables,(totalMoney-priceForTheseVegetables));

            }









        }




    }//ТРЯБВА ПОДОБРЕНИЕ !!!!

    public static void traditionalSaladVersion2() {
        /*3. Искате да си направите шопска салата. Трябват ви домати, краставици, лук, чушки, сирене:
Цената на продуктите
Домати - 7лв/кг
Краставици - 6лв/кг
Чушки-5лв/кг
Лук-3лв/кг
Сирене-15лв/кг
Имате 20лв колко салата може да си направите?
//Оцет, олио и сол си имате вкъщи

         */

         Scanner scanner = new Scanner(System.in);



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
            System.out.println("Hello we sell Cheese,peppers,onions,cucumbers,tomato's what would u like to buy");

            while (!command.equalsIgnoreCase("Stop")) {

                command = scanner.nextLine();

                if (command.equalsIgnoreCase("cheese")) {
                    System.out.println("Enter the quantity of cheese u want to buy");
                    quantity = scanner.nextDouble();
                    totalPriceForVegetable = (quantity * cheese);
                    totalMoney -= totalPriceForVegetable;
                    quantityOfCheese += quantity;
                    continue;

                } else if (command.equalsIgnoreCase("onion")) {
                    System.out.println("Enter the quantity of onion u want to buy");
                    quantity = scanner.nextDouble();
                    totalPriceForVegetable = (quantity * onion);
                    totalMoney -= totalPriceForVegetable;
                    quantityOfOnion += quantity;
                    continue;

                } else if (command.equalsIgnoreCase("tomato")) {
                    System.out.println("Enter the quantity of tomato's u want to buy");
                    quantity = scanner.nextDouble();
                    totalPriceForVegetable = (quantity * tomato);
                    totalMoney -= totalPriceForVegetable;
                    quantityOfTomato += quantity;
                    continue;

                } else if (command.equalsIgnoreCase("cucumber")) {
                    System.out.println("Enter the quantity of cucumbers u want to buy");
                    quantity = scanner.nextDouble();
                    totalPriceForVegetable = (quantity * cucumber);
                    totalMoney -= totalPriceForVegetable;
                    quantityOfCucumber += quantity;
                    continue;

                } else if (command.equalsIgnoreCase("peppers")) {
                    System.out.println("Enter the quantity of peppers u want to buy");
                    quantity = scanner.nextDouble();
                    totalPriceForVegetable = (quantity * peppers);
                    totalMoney -= totalPriceForVegetable;
                    quantityOfPeppers += quantity;
                    continue;
                }
                if (!command.equalsIgnoreCase("Stop")) {
                    double canBuyCheese = totalMoney / cheese;
                    double canBuyOnion = totalMoney / onion;
                    double canBuyTomato = totalMoney / tomato;
                    double canBuyCucumber = totalMoney / cucumber;
                    double canBuyPeppers = totalMoney / peppers;

                    System.out.println("You have " + totalMoney + "lv. left u can buy ");
                    System.out.printf("%.3f kilograms of cheese%n", canBuyCheese);
                    System.out.printf("%.3f kilograms of onion%n", canBuyOnion);
                    System.out.printf("%.3f kilograms of tomato%n", canBuyTomato);
                    System.out.printf("%.3f kilograms of cucumber%n", canBuyCucumber);
                    System.out.printf("%.3f kilograms of peppers%n", canBuyPeppers);


                    System.out.println("Hello we sell Cheese,peppers,onions,cucumbers,tomato's what would u like to buy");
                }

            }
            double totalSaladMade = quantityOfCheese + quantityOfCucumber + quantityOfOnion
                    + quantityOfPeppers + quantityOfTomato;
            System.out.printf("\n%.3f you bought kilograms of cheese\n", quantityOfCheese);
            System.out.printf("%.3f you bought kilograms of onion\n", quantityOfOnion);
            System.out.printf("%.3f you bought kilograms of tomato\n", quantityOfTomato);
            System.out.printf("%.3f  you bought kilograms of cucumber\n", quantityOfCucumber);
            System.out.printf("%.3f you bought kilograms of peppers\n", quantityOfPeppers);

            System.out.printf("\nYou have %.2flv. left and u can make %.3f grams of traditional salad"
                    , totalMoney, totalSaladMade);
        }









    public static void main(String[] args) {

       // leapYear();
       // vowels();
       // shoes();
      //  golfBalls();
      //  squareOrRectangle();
       // grade();
       // salaryBonus();
       // discountForCloths();
       // cinemaTickets();
        //traditionalSalad();
        traditionalSaladVersion2();



    }
}
