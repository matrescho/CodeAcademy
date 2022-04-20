import java.util.Scanner;

public class javaMethods {



    public static int sum (int a , int b){
        if (a > b){
            System.out.println(a);
            return a;
        }else{
            System.out.println(b);
            return b;
        }
    }

    public static double average(double number1, double number2, double number3 ){

        double result = (number1 + number2 + number3) /3;
       // System.out.printf("%.2f",result);
        return result;

    }


    public static String name(){

        String name = "Bobi";
        System.out.println(name);
        return name;
    }


    public static void main(String[] args) {
       // sum(5,7);

        Scanner scanner = new Scanner(System.in);
       name();
        System.out.println("Average grade is :"+Math.round(average(5,8,6)));
       average(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());



    }









}
