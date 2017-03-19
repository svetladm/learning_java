package date_2017_03_11;

import java.util.Scanner;

public class p3_greeting_by_name {

    public static class greetings {

        public static void main (String [] varargs){

            Scanner console = new Scanner (System.in);

            String name1 = console.nextLine ();
            System.out.print("Hello, " +  name1 + "!");
        }

    }
}
