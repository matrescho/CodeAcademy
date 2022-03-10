import java.util.Scanner;

public class test {
    public static void main(String[] args) {



        String name = "Borislav";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        int a = 345;
        int b = 445;
        System.out.println(a + b );

        int num1 = Math.abs(-147);
        int num2 = Math.abs(15);
        int num3 = Math.abs(0);
        int num4 =Math.abs(18);

        System.out.println(num1 + "\t" + num2 + "\t" + num3 +"\t"+ num4);

        double num5 = Math.sqrt(8);
        double num6 = Math.sqrt(353);
        double num7 = Math.sqrt(78);
        double num8 = Math.sqrt(3);
        double num9 = Math.sqrt(-67);
        double num10 = Math.sqrt(723);
        double num11 = Math.sqrt(2000);
        double num12 = (Math.abs(Math.sqrt(-100)));

        System.out.println(num5 + " " + num6 +" "+ num7 + " " + num8 + " " + num9
                + " " + num10 + " " + num11 + " " + num12);


        double num13 = Math.pow(-20,2);
        double num14 = Math.pow(92,2);
        double num15 = Math.pow(638,2);
        double num16 =Math.pow(73,2);
        double num17 = Math.pow(200,2);
        double num18 = Math.pow(-22,2);

        System.out.println(num13 + " " + num14 + " " + num15 + " " + num16 + " " + num17 + " " + num18 );

    }
}
