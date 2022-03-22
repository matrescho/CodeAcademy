import java.text.DecimalFormat;

public class homeWork_16_03_2022 {

    public static void springSeasonTrue(){

        int month = 3;//месец март
        int day = 20;// 20 март

        if (month >=3 && month <=6 && day >=1 && day <=20){
            System.out.println("True");
        }else{
            System.out.println("false");
        }

    }

    public  static void springSeasonFalse(){

        int month = 1;
        int day = 18;

        if(month != 3 || month != 4 || month != 5 || month != 6){
            System.out.println("False");
            //като тука не ни интересува деня защото знаем че месеца не е този който търсим
        }

    }

    public static void BMI(){

        double height = 1.75;
        double weight = 90;

        double result = weight/(height*height);
        System.out.printf("%.2f This is my BMI",result);

    }

    public static void distance(){


        double x = 35;
        double y = 25;

        double distance = Math.sqrt(Math.pow(x,2) + Math.sqrt(Math.pow(y,2)));
        System.out.println(distance);


    }

    public static void main(String[] args) {
        springSeasonTrue();
        springSeasonFalse();
        distance();

        int month = 3;//месец март
        int day = 20;// 20 март

        String trueOrFalse =  month >=3 && month <=6 && day >=1 && day <=20 ? "True" : "False";
        System.out.println(trueOrFalse);
        BMI();

    }
}
