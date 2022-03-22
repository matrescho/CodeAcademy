import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndSecondSmallestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element in the arrays is: " + smallest);
        System.out.println("The second smallest element in the arrays is: " + secondSmallest);
    }
}
 