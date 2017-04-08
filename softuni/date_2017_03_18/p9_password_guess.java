package date_2017_03_18;

import java.util.Scanner;

/**
 * Created by svetlana on 8.4.2017 г..
 */
public class p9_password_guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine ();

        if (text.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}
