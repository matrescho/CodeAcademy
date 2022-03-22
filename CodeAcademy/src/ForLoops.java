import java.util.Arrays;

public class ForLoops {
    public static void main(String[] args) {

        int number = 0;
      //  number +=2;// с това += добавяме определено число към стойноста на променливата
      //  number -= 2;
      //  number --;
      //  number ++;


        for (int i = 0; i < 10 ; i++ ) {
           // System.out.println(i);
        }

        int [] numbers = {3, 5 ,100, 250, 31, 15, 16};

        Arrays.stream(numbers).forEach(System.out::println);//за малко по напреднали

        String[] names ={"Bobi","Nadezhda", "Kolio"};

       /* char[] reverse = "Bobi".toCharArray();

        for (int i = reverse.length -1; i>= 0 ; i-- ){
            System.out.println(reverse[i]);//принтва стринг от зад напред */

        for (String name :names){
            System.out.println(name);
        }

        for (int number1 :numbers){
            System.out.println(number1);/* по лесен начин тука казваме на програмата
            за number1 му задай една по една всички стойности от numbers*/
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);/*/С това принтим колко числа има в нашият арей може да спрем
             на определен брой и тн. */
        }

    }
}

