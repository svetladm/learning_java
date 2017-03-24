package com.company;


import java.util.Scanner;

public class area_of_figures {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String figure = scan.nextLine ();
        double a = Double.parseDouble(scan.nextLine());
        double result = 0;

        if (figure.equals ("square")){
            result = a*a;
            System.out.printf ("%.3f", result);
        }
        else if (figure.equals ("circle")){
            result = a*a*Math.PI;
            System.out.printf ("%.3f", result);
        } else {

            double b = Double.parseDouble(scan.nextLine());

            if (figure.equals("triangle")) {
                result = 0.5 * a * b;

                System.out.printf("%.3f", result);
            } else if (figure.equals("rectangle")) {
                result = a * b;
                System.out.printf("%.3f", result);
            }
        }

    }
}
