import java.util.Arrays;

public class Arrayss {

    public static void main(String[] args) {

        int [] numbers = new int[2];/*със първите [] правим int-a na array с вторите [] казваме колко числа ще има
        този Array */
        numbers[0] = 1;//тука задаваме числата в Array
        numbers[1] = 2;

        int [] numbers1 = {3, 5, 6, 7};/* другия начин да направим array без първоначално да му задаваме колко
        числа ще има в него */

        numbers1[0] = 1;//Тука променяме първия индекс в Array със стойноста която му зададем

        int a = numbers1[3];//тука задаваме на "a" стойноста на 3тия индекс в нашия аррей което е =7
        System.out.println(a);
        int last =numbers1[numbers1.length -1];/*ако имаме много числа и ни трябва последното или искаме да видиме
        колко на брой числа имаме */


        String [] names = {"Jhon", "Bobi", "Nadezhda", "CodeAcademy"};// Array със стринг


        boolean [] name = new boolean[2];//Array за болеви изрази
        String [] strings = new String[2];
        System.out.println(Arrays.toString(numbers));//С това принтираме какво има в Array
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(numbers1.length);//с това принтираме колко числа има в Arrayю
        System.out.println(Arrays.toString(names));



    }
}
