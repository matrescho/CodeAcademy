import java.util.Scanner;

public class InvestmentCalculator {




    public static void MathBehindTheProgram(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("How much money will u invest ");
        double investment = scanner.nextDouble();
        System.out.println("How many years do u plan on investing with us");
        double investmentPeriod = scanner.nextDouble() * 12;
        System.out.println("Interest rate ");
        double interestRate = scanner.nextDouble() /100;

       double totalInvestedMoney = investmentPeriod*investment;
       double totalProfit = (totalInvestedMoney * interestRate )* (investmentPeriod / 12) ;


        System.out.printf("You will invest a total of %.2flv. for a period of %.2f years.. and your profit" +
                        " will be %.2flv. For your time investing with us"
                ,totalInvestedMoney,(investmentPeriod / 12),totalProfit);

    }



    public static void main(String[] args) {

        MathBehindTheProgram();






    }




}
