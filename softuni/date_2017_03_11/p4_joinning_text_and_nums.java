package date_2017_03_11;

import java.util.Scanner;

public class p4_joinning_text_and_nums {

    public static class greetings {

        public static void main (String [] varargs){

            Scanner console = new Scanner (System.in);

            String firstName = console.nextLine ();
            String lastName = console.nextLine ();
            int age = Integer.parseInt (console.nextLine ());
            String town = console.nextLine ();
            char point = '.';

            System.out.print("You are " +  firstName + " " + lastName + ", a" + " " + age + "-years old person from " + town + point);
        }

    }
}
