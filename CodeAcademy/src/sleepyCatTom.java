import java.util.Scanner;

public class sleepyCatTom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int daysOf = scanner.nextInt();

        int totalHoursOfPlay = ((365 - daysOf) * 63)+ (daysOf * 127);//смятаме колко общо минути играе том на година
        int difference = Math.abs(30000 - totalHoursOfPlay);
        double hours = difference / 60;//Взимаме часовете от всички общо минути
        double minutes = difference % 60;// тука взимаме колко минути остават след като обърнем всички общо в часове


        if (totalHoursOfPlay> 30000){//ако том играе повече от колкото трябва
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play",Math.floor(hours), Math.floor(minutes));
        }else{//ако том не играе повече от колкото трябва
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play",Math.floor(hours), Math.floor(minutes));
        }

    }
}
