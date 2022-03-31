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



    public static void main(String[] args) {
        leapYear();
        vowels();
        shoes();

    }
}
