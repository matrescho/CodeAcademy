/* Задача: зеленчукова борса
Градинар продава реколтата от градината си на зеленчуковата борса. Продава зеленчуци за N лева на килограм и плодове за M лева за килограм. Напишете програма, която да пресмята приходите от реколтата в евро (ако приемем, че едно евро е равно на 1.94 лв.).

Входни данни
От конзолата се четат 4 числа, по едно на ред:

Първи ред – цена за килограм зеленчуци – число с плаваща запетая.
Втори ред – цена за килограм плодове – число с плаваща запетая.
Трети ред – общо килограми на зеленчуците – цяло число.
Четвърти ред – общо килограми на плодовете – цяло число.
Ограничения: всички числа ще са в интервала от 0.00 до 1000.00.
 */



import java.util.Scanner;

public class vegetableSellerExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerKiloVegetables = scanner.nextDouble();
        double pricePerKiloFruits = scanner.nextDouble();
        int vegetableWeight = scanner.nextInt();
        int fruitWeight = scanner.nextInt();

        double priceForVegetables = pricePerKiloVegetables * vegetableWeight;
        double priceForFruits = pricePerKiloFruits * fruitWeight;

        System.out.println((priceForFruits + priceForVegetables) /1.94);







    }
}
