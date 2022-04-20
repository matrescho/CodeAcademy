import java.util.Scanner;

public class SquareCalculator

{

    public static int triangleArea(int width,int height){
        return (width * height) /2;

    }
    public static int rectangleArea(int width, int height){
        return width * height;
    }

    public static double circleArea(double radius){
        return (radius * radius) * Math.PI;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a Circle,Rectangle or Triangle to find its area");
        String object = scanner.nextLine();

        if (object.equalsIgnoreCase("circle")){
            System.out.println("Please enter the radius of the circle in cm.");
            double radius = scanner.nextDouble();
            System.out.printf("Your circle area is  %.2fcm.",circleArea(radius));
        }else if (object.equalsIgnoreCase("triangle")){
            System.out.println("Please enter the width of your triangle in cm.");
            int width = scanner.nextInt();
            System.out.println("Please enter the height of your triangle in cm.");
            int height = scanner.nextInt();
            System.out.printf("The area of your triangle is %dcm.",triangleArea(width,height));
        }else if (object.equalsIgnoreCase("rectangle")){
            System.out.println("Please enter the width of your rectangle in cm. ");
            int width = scanner.nextInt();
            System.out.println("Please enter the height of your rectangle in cm.");
            int height = scanner.nextInt();
            System.out.printf("The area of your triangle is %dcm.",rectangleArea(width,height));
        }


    }

}
