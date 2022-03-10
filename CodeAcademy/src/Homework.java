public class Homework {

    public static void myName() {
        String name ="Borislav";
        System.out.println(name.length());
    }

    public static void multiply(){
        int a = 5;
        int b = 8;
        int result = a + b;
        System.out.println(result);
    }
    public static void absValue(){
        int num1 = Math.abs(-147);
        int num2 = Math.abs(15);
        int num3 = Math.abs(0);
        int num4 = Math.abs(18);
        System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + num4);
    }

    public static void srqRoot(){
        double num1 = Math.sqrt(8);
        double num2 = Math.sqrt(353);
        double num3 = Math.sqrt(78);
        double num4 = Math.sqrt(3);
        double num5 = Math.abs(Math.sqrt(-67));
        double num6 = Math.sqrt(723);
        double num7 = Math.sqrt(2000);
        double num8 = Math.sqrt(-100);
        System.out.println(num1 + " " + num2 +" "+ num3 + " " + num4 + " " + num5 + " "
                + num6 + " " + num7 + " " + num8);

    }

    public static void pow (){
        double num1 = Math.pow(-20 , 2);
        double num2 = Math.pow(92 , 2);
        double num3 = Math.pow(638 , 2);
        double num4 = Math.pow(73 , 2);
        double num5 = Math.pow(200 , 2);
        double num6 = Math.pow(-22 , 2);

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 );




    }

    public static void main(String[] args) {
        myName();
        multiply();
        absValue();
        srqRoot();
        pow();
        System.out.println("Great Lesson!!");

        //Proba
    }
}

