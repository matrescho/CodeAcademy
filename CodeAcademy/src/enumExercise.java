import java.util.Locale;
import java.util.Scanner;




public class enumExercise {

    enum levelDifficulty{
        LOW,MEDIUM,HIGH,INSANE
    }

    public static void levels(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Chose a Game level");
        String level = scanner.nextLine();

        levelDifficulty LevelDifficulty = levelDifficulty.valueOf(level.toUpperCase(Locale.ROOT));/* тука реалното което
        правим е взимаме инпут който го съхраняваме в стринг и стойноста на този стринг предаваме на levelDifficulty
        с помоща на LevelDifficulty
       */

        switch (LevelDifficulty){
            case LOW: System.out.println("Your playing on the lowest Difficulty");
                break;
            case MEDIUM: System.out.println("You are playing on medium");
                break;
            case HIGH: System.out.println("You are a game lover playing on high");
                break;
            case INSANE: System.out.println("Welcome True Gamer Insane Game play awaits u");

        }

    }


    enum coffeeSize{
        SMALL(25),
        MEDIUM(45),
        LARGE(100);

        private int volume;//Съсдаваме инт за обема
        coffeeSize(int volume){//идея си нямам точно какво става в следващите 2 реда
            this.volume = volume;
        }

        public int getVolume() {
            return volume;

        }
    }


    public static  void coffee (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What size coffee do u want");
        String cup = scanner.nextLine();
        coffeeSize CoffeeSize = coffeeSize.valueOf(cup.toUpperCase(Locale.ROOT));

        int  volume1 =CoffeeSize.getVolume(); // Тука взимаме обема на чашата

        switch (CoffeeSize){
            case SMALL:
            case MEDIUM:
            case LARGE:
                System.out.println("You ordered a "+ cup + " coffee with a volume of "+volume1);
                break;
        }

    }

    public static void main(String[] args) {

     levels();
     coffee();


    }
}
