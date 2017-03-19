package date_2017_03_11;

import java.util.Scanner;

public class p4_joining_text_and_nums_place_holders {

    public static class greetings {

        public static void main(String[] varargs) {

            Scanner console = new Scanner(System.in);

            String firstname = console.nextLine();
            String lastname = console.nextLine();
            int age = Integer.parseInt(console.nextLine());
            String town = console.nextLine();
            char point = '.';

            System.out.printf("You are %s %s, a %d-years old person from %s.", firstname, lastname, age, town);
        }
    }
}



