public class test101 {

    public static void main(String[] args) {

        int a = 5;
        for (int i = a; i >= 1; i--) {
            for (int j = a; j >= 1; j--) {
                System.out.print(j + " ");
            }
            a--;

            System.out.println();
        }
    }
}