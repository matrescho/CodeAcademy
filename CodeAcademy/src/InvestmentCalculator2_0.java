import java.util.Scanner;

public class InvestmentCalculator2_0 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount u wish to invest each month with us.");
        double investmentEachMonth = scanner.nextDouble();
        System.out.println("Enter the number of years u wish to invest with us.");
        byte yearsInvesting = scanner.nextByte();
        System.out.println("Preferable interest rate ..");
        double interestRate = scanner.nextDouble();

        int totalMonthsOfInvesting = yearsInvesting * 12;
        double totalMoneyInvested = 0;
        double totalProfit = 0;

        for (int i = 1; i <= totalMonthsOfInvesting;i++){
            totalMoneyInvested += investmentEachMonth;
            if (i % 12 == 0) {
                totalProfit += totalMoneyInvested * (interestRate / 100);
            }

        }

        System.out.printf("You have invested a total of %.2flv.Your profit will be %.2flv. "
                ,totalMoneyInvested,totalProfit);
    }

}
