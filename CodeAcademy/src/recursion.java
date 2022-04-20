import java.util.Scanner;

public class recursion {
    static void multiplication(int number, int i) {
        if (i > 10)
            return;
        System.out.println(number + " * " + i + " = " + number * i);

        multiplication(number, i + 1);
    }


    public static void main(String[] args)

    {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number for multiplication table");
            int number = scanner.nextInt();

            multiplication(number, 1);

    }
}
