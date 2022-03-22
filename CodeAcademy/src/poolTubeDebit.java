import java.text.DecimalFormat;
import java.util.Scanner;

public class poolTubeDebit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.##");
        double poolVolume = scanner.nextDouble();
        double firstPipeDebit = scanner.nextDouble();
        double secondPipeDebit = scanner.nextDouble();
        double timePassed = scanner.nextDouble();

        double water = firstPipeDebit * timePassed + secondPipeDebit * timePassed;

        if (water <= poolVolume){

            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%",
            Math.floor(water  /poolVolume *100),
            Math.floor(firstPipeDebit * timePassed / water * 100),
                    Math.floor(secondPipeDebit * timePassed / water * 100));



        }

        }






    }

