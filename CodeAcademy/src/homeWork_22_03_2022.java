import java.util.Scanner;

public class homeWork_22_03_2022 {

    public static void springSeason (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the month ");
        int day = scanner.nextInt();
        System.out.println("Enter the month");
        int mount = scanner.nextInt();

        if (mount >= 3 && day >=20 && mount <=6 && day <=20 ){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }

    public static void BMI (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height:");
        double height = scanner.nextDouble();
        System.out.println("Enter your Weight:");
        double weight = scanner.nextDouble();

        double result = weight/(height*height);
        if(result <= 18.5){
            System.out.println("Underweight");
        }else if (result > 18.5 && result <= 24.9){
            System.out.println("Normal weight");
        }else {
            System.out.println("Overweight");
        }
    }

    public static void triangle (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side X");
        double x = scanner.nextDouble();
        System.out.println("Enter side Y");
        double y = scanner.nextDouble();
        System.out.println("Enter side Z");
        double z = scanner.nextDouble();

        if (x == y && z == y && z == x){
            System.out.println("Равностранен");
        }else if (x == y || x == z || y == z){
            System.out.println("Равнобедрен");
        }else {
            System.out.println("Разностранен");
        }



    }

    public static void monthOfTheYear(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number from 1-12");
        int month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;


        }

    }



    public static void main(String[] args) {
       springSeason();
       BMI();
       triangle();
       monthOfTheYear();
        System.out.println("Long Live CodeAcademy!!!");

    }
}
