import java.util.Locale;
import java.util.Scanner;

public class CodeAcademyExercise {
    static int factorial (int n){
        if (n ==0)
            return 1;
        return n * factorial(n-  1);
    }

    public static void vowels () {


        /*▪  да си купите нови маратонки. Оглеждате офертите, но имате
няколко изисквания:
1. Цената им не трябва да е над 150 лв.;
2.  да са размер 44 или 45;
3.  да не са черни;
4.  задължително да можете да ги върнете;
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
            } else if (letter.length() == 1) {
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
▪  да си купите нови маратонки. Оглеждате офертите, но имате
няколко изисквания:
1. Цената им не трябва да е над 150 лв.;
2.  да са размер 44 или 45;
3.  да не са черни;
4.  задължително да можете да ги върнете;
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

    public static void traditionalSaladVersion2()
    {
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

    public static void addNumbers100 (){

        /*Напишете програма, която събира само положителни числа до 100, ако
потребителят въведе отрицателно число го пропускате.

         */


            Scanner scanner = new Scanner(System.in);

            System.out.println("Add bunch of random numbers and if they are in parameters the program will add them" +
                    "if u wish to stop the program enter the Devil's number");
            int number1 = 0;

            while ( number1 !=666){
                System.out.println("Enter a number");
                 number1 = scanner.nextInt();

                if(number1 < 0){
                    System.out.println("You must enter a positive number");
                    continue;
                }else if (number1 > 100){
                    System.out.println("You must enter a number lower then 100");
                    continue;
                }else{
                  int result =  number1 + number1;
                    System.out.println(number1 + " + " + number1 + " = " + result);
                }






            }








        }

    public static void factorial(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number to calculate factorial \nif u wish to stop calculation" +
                "please enter the devils number:");
        int number = 0;
        while (number != 666) {
            number = scanner.nextInt();
            System.out.println("Factorial of " + number + " is " + factorial(number));
        }







    }

    public static void printTriangle(){

                int a = 5;
                for (int i = a; i >= 1; i--) {
                    for (int j = a; j >= 1; j--) {
                        System.out.print(j + " ");
                    }
                    a--;

                    System.out.println();
                }
            }

    public static void isTheWordPalindrome(){


        Scanner scanner = new Scanner(System.in);

        boolean isPalindrome = false;

        while (!isPalindrome){

            System.out.println("Enter a word to check if its palindrome");
            String word = scanner.nextLine();

            String wordInReverse = new StringBuilder(word).reverse().toString();

            if (wordInReverse.equalsIgnoreCase(word)){
                System.out.println("Your word is palindrome");
                isPalindrome = true;
            }else {
                System.out.println("Your word is not a palindrome");
            }

        }


    }

    public static void drawSquare(){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square");
        int size = scanner.nextInt();


        if (size >= 1 && size <= 30){

            for (int i = 1; i<= size; i++){
                for (int j = 1; j <=size;j++){
                    System.out.print("#" + " ");
                }
                System.out.println();

            }

        }else {
            System.out.println("Wrong Size");
        }






    }

    public static void addNumbersTogether(){

        Scanner scanner = new Scanner(System.in);

        String command = "";

        do {


            System.out.println("Enter first number");
            int number1 = scanner.nextInt();
            System.out.println("Enter Second number");
            int number2 = scanner.nextInt();

            int result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);


            System.out.println("Do you want to add numbers again or exit the program yes or no");
            command = scanner.next();



        }while (command.equalsIgnoreCase("yes"));


    }

    public static void enterNumbers(){

        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("Enter whatever numbers u like if u ever wish to stop enter the Devil's number");
       double number = scanner.nextDouble();




       do {
           System.out.println("Enter a new number");
            number = scanner.nextDouble();

           if (number > 0){
               positive++;
           }else if (number < 0){
               negative++;
           }else if (number == 0){
               zero++;
           }
       }while (number !=666);

        System.out.println("You have entered \n" + positive + " Positive numbers\n" + negative + " Negative numbers\n" +
                ""+ zero + " total times u entered 0 ");

    }

    public static void MinAndMaxNumber(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are here to enter some numbers if u ever wish to stop enter the devil's number");

        int  number = scanner.nextInt();

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        while (number != 666){//като може и да го направим с проверка след всеки 2 числа да пита
            //дали да продължим но сметнах че така ще е по бързо

            System.out.println("Enter a new number");
            number = scanner.nextInt();

            if (number > maxNumber){
                maxNumber = number;
            }else if (number < minNumber){
                minNumber = number;
            }
        }


        System.out.println(maxNumber);
        System.out.println(minNumber);

    }

    public static void reverseNumbers(){

        Scanner scanner = new Scanner(System.in);
        int numberInReverse = 0;
        int number = scanner.nextInt();
        System.out.println("Your number is " + number );
        while(number != 0) {


            int digit = number % 10;
            numberInReverse = numberInReverse * 10 + digit;


            number /= 10;
        }

        System.out.println("Reversed Number: " + numberInReverse);
        System.out.println(new StringBuffer(String.valueOf(number)).reverse());//Най лесният начин
    }



    public static void enterAccount(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello please enter pin to enter ");

        int pin = 0;
        int numberOfWrongPins = 0;

        while (pin != 7828){
            pin = scanner.nextInt();
            numberOfWrongPins ++;
            if (numberOfWrongPins == 3){
                System.out.println("Account blocked");
                break;
            }else if (pin == 7828){
                System.out.println("Welcome Mr.Tony Stark");
                break;
            }
            System.out.println("You have entered a wrong pin");
        }


    }

    public static void stringVowels(){

        Scanner scanner = new Scanner(System.in);

        String numberOfVowels = scanner.nextLine().toLowerCase();
        int vowels = 0;

        for (int i = 0;i<numberOfVowels.length();i++){



            if(numberOfVowels.charAt(i) == 'a'|| numberOfVowels.charAt(i) == 'e'||
                    numberOfVowels.charAt(i) == 'i' || numberOfVowels.charAt(i) == 'o' ||
                    numberOfVowels.charAt(i) == 'u'){
                vowels++;
            }


        }
        System.out.println("The string u entered contains " + vowels + " Vowels" );

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
       // traditionalSaladVersion2();
       // addNumbers100();
       //factorial();
      //  printTriangle();
       // isTheWordPalindrome();
        // drawSquare();
      //  addNumbersTogether();
      //  enterNumbers();
       // MinAndMaxNumber();
       // reverseNumbers();
       // enterAccount();
       // stringVowels();






    }
}
