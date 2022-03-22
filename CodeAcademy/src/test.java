import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int time = 5725;
        int hours = time / 60;
        int minutesremaning = time % 60;

        System.out.printf("%d:%02d",hours,minutesremaning);
        System.out.println(hours+minutesremaning);


        System.out.println(time);
    }
}
 