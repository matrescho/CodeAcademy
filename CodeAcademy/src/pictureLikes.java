import java.util.Scanner;

public class pictureLikes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pictureLikes = 52;



            counter(scanner, pictureLikes);
            System.out.println(pictureLikes);
        }




    public static void counter(Scanner scanner, int pictureLikes) {
        System.out.println("Do you like this picture.. Y/N");
        String command = scanner.nextLine();
        if (command.equalsIgnoreCase("y")){
            pictureLikes++;
            System.out.println("U liked the picture new likes count = " + pictureLikes);
        }
    }


}
