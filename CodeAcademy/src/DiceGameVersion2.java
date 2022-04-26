import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DiceGameVersion2 {

    public  static int diceThrow(int sideNum) {
        int dice1 = (int) (Math.random() * sideNum + 1);
        int dice2 = (int) (Math.random() * sideNum + 1);
        return dice1+dice2;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        ArrayList playersResults = new ArrayList();
        ArrayList players = new ArrayList();
        int i = 0;
        String command = "";

       do {
           i++;
           System.out.println("Welcome to our dice game throw the dice the bigger the better ");
           System.out.println("Throw the Dice... Y/N");
           command = scanner.next();
           playersResults.add(diceThrow(6));
           players.add(i);
           if(command.equalsIgnoreCase("n")){
               break;
           }
           if (playersResults.contains(12)){
               System.out.println("WE HAVE A WINNER WITH DICE OF 12 !!!! GAME OVER");
               break;
           }
           System.out.println("Rolling The Dice.. YOU THREW : " + playersResults.get(playersResults.size()-1)+"!");

       }while (!command.equalsIgnoreCase("n"));

      int indexOfWinner = playersResults.indexOf(Collections.max(playersResults));
      Collections.sort(playersResults);
      int winningDice = (int) playersResults.get(playersResults.size()-1);


        System.out.println("The BIG WINNER IS... PLAYER"+ (indexOfWinner+1)+"  With dice of " + winningDice);


    }


}

