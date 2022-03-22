import java.util.Scanner;

public class homeWorkUserInput {


    public static void squareroot (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number:");
        double number = scanner.nextDouble();
        double result = Math.sqrt(number);
        System.out.printf("%.5f",number);

    }

    public static void oddOrEven(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter your number:");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Your number is even");
        }else {
            System.out.println("Your number is odd");
        }
    }

    public static void grades(){

        String name1 = "Ivanka Grade:";
        String name2 = "Draganka Grade:";
        String name3 = "Petkanka Grade:";
        String name4 = "TONKA Grade:";
        String name5 = "Marika Grade:";

        int grade1 = 2;
        int grade2 = 2;
        int grade3 = 2;
        int grade4 = 2;
        int grade5 = 2;

        System.out.printf("%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d",name1,grade1,name2,grade2,name3,grade3
                ,name4,grade4,name5,grade5);


    }

    public static void main(String[] args) {
      squareroot();
      oddOrEven();
       grades();

    }
}
