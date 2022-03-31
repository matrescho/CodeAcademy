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









    public static void main(String[] args) {
       // leapYear();
       // vowels();
       // shoes();
      //  golfBalls();
      //  squareOrRectangle();
       // grade();
       // salaryBonus();
       // discountForCloths();



    }
}
