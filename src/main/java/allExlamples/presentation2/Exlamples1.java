package allExlamples.presentation2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Check whether the e-mail address received from the user complies with the format.

public class Exlamples1 {
    public static boolean kontrol(String email) {
        // A regular expression (regex) is used to check the email address.
        String format = "^[A-Za-z0-9+_.-]+@(.+)+.com$";
        Pattern model = Pattern.compile(format);
        Matcher match = model.matcher(email);
        return match.matches();
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your e-mail account.");
        String userMail= scan.next();

        if (kontrol(userMail)) {
            System.out.println("Email address is valid.");
        } else {
            System.out.println("Email address is not valid.");
        }

    }
}
