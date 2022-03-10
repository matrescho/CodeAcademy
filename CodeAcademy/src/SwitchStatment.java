import java.util.Scanner;

public class SwitchStatment {
    public static void gender() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your gender");
        String gender = scanner.nextLine();

        switch (gender){//тука му казаме да провери какво има в gender
            case "Male":
                System.out.println("Im a Male");
                break;
            case "Female":
                System.out.println("Im a Female");
                break;
            case"Prefer not to say":
                System.out.println("Secret");
                break;
            default:
                System.out.println("Bye bye");
        }
    } public static void age (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = scanner.nextInt();
        switch (age){  //тук му казваме да провери какво число е в  int age
            case 15:// ако сме написали 15 в терминала ше се изпълни това условие
                System.out.println("im not adult");
                break;/* този брейк е задължителен до джава 11 защото ако не го напишем без значение какво сме въвели
                        в терминала всичките Кейсове (case) ще се изпълнят */
            case 18:
                System.out.println("Im adult");
                break;
            case 50:
                System.out.println("Im old");
                break;
            default://това е ако всичките кейсове до сега са False демек ако не влезнем в нито един кейс правим това
                System.out.println("Im a toddler");
        }

    }

    public static void main(String[] args) {
        age();
        gender();
    }

}

