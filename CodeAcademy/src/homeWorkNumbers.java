import java.math.BigDecimal;

public class homeWorkNumbers {
    public static void numbers() {
        short number = -250;
        short number1= 250;
        int number2 = 4_589_498;
        double number3 = 10_000_000_000_000_000_000d;//слагаме Double защото в лонг не се побира
        long number4 = 9_000_000_000_000_000_000L;
        System.out.println(number + "\n" + number1 + "\n" + number2 + "\n" + number3 + "\n" + number4);
    }
    public static void numbers1 (){
        int number = 43112;
        int number1 = -1_357_674;
        int number2 = 1_357_674;
        int number3 = -1_357_674_000;
        long number4 = 3_657_895_000L;
        System.out.println( "\n" + number + "\n" + number1 + "\n" + number2 + "\n" + number3 + "\n" + number4);
    }

    public static void decimalNumbers (){

        double number = 4.9876543;
        double number1 = 7.123456789012345678890;
        double number2 = 18_398_458_438_583_853.28;
        BigDecimal bigDecimal = new BigDecimal(18_398_458_438_583_853.39875937284928422);
        System.out.println("\n" + number + "\n" + number1 + "\n" + number2 + "\n" + bigDecimal + "\n");


    }

    public static void main(String[] args) {
        numbers();
        numbers1();
        decimalNumbers();
    }
}
