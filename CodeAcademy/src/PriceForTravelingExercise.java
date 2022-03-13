/*Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:

Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв./км. Нощна тарифа: 0.90 лв./км.
Автобус. Дневна / нощна тарифа: 0.09 лв./км. Може да се използва за разстояния минимум 20 км.
Влак. Дневна / нощна тарифа: 0.06 лв./км. Може да се използва за разстояния минимум 100 км.
Напишете програма, която въвежда броя километри n и период от деня (ден или нощ) и изчислява цената на най-евтиния транспорт.

Входни данни
От конзолата се четат два реда:

Първият ред съдържа числото n – брой километри – цяло число в интервала [1 … 5000].
Вторият ред съдържа дума "day" или "night" – пътуване през деня или през нощта.
Изходни данни
Да се отпечата на конзолата най-ниската цена за посочения брой километри. */


import java.util.Scanner;

public class PriceForTravelingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = scanner.nextInt();
        String timeOfDay = scanner.next();

        if (kilometers > 100){
            double priceOfTrip = 0.06 * kilometers;
            System.out.println(priceOfTrip);

        }else if (kilometers > 20 && kilometers <100){
            double priceOfTrip = 0.09 *kilometers;
            System.out.println(priceOfTrip);

        }else if (kilometers <20 && timeOfDay.equals("day")){
                double priceOfTrip = (kilometers * 0.79) + 0.70;
                System.out.println(priceOfTrip);

        }else{
            double priceOfTrip = (kilometers * 0.90) + 0.70;
            System.out.println(priceOfTrip);


        }

    }
}
