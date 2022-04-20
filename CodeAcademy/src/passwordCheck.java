import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordCheck {



    public static boolean
    isValidPassword(String password)
    {


        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";



        Pattern p = Pattern.compile(regex);

        Matcher matcher = p.matcher(password);

        return matcher.matches();
    }


    public static void main(String args[]) {


        String str1 = "Proverka@30";
        System.out.println(isValidPassword(str1));


    }
}


