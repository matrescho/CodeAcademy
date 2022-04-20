import java.util.Scanner;

public class diceGame {

    public static int diceThrow(int a ,int b ){
        int dice1 = (int)(Math.random()* 6+1);
        int dice2 = (int)(Math.random()*6+1);
        return dice1 + dice2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int winner = Integer.MIN_VALUE;


        int playerOne = diceThrow(1,1);
        System.out.println(playerOne);

        int playerTwo = diceThrow(1,1);
        System.out.println(playerTwo);

        int playerTree = diceThrow(1,1);
        System.out.println(playerTree);

        if(playerOne > playerTwo && playerOne > playerTree){
            winner = playerOne;
            System.out.println("And the winner is PlayerOne !! with the biggest dice roll " + winner);
        }else if (playerTwo > playerOne && playerTwo > playerTree){
            winner = playerTwo;
            System.out.println("And the winner is PlayerTwo !! with the biggest dice roll " + winner);
        }else {
            winner = playerTree;
            System.out.println("And the winner is PlayerTree !! with the biggest dice roll " + winner);
        }











       }


    }



