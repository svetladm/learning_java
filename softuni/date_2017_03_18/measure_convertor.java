package com.company;

import java.util.Scanner;

public class measure_convertor {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double measure = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine().toLowerCase();
        String output = scan.nextLine().toLowerCase();

        if (input.equals("mm")) {
            measure = measure / 1000;
        }
        else if (input.equals("cm")) {
            measure = measure / 100;
        }
        else if (input.equals("mi")) {
            measure = measure / 0.000621371192;
        }
        else if (input.equals("in")) {
            measure = measure / 39.3700787;
        }
        else if (input.equals("km")) {
            measure = measure /  0.001;
        }
        else if (input.equals("ft")) {
            measure = measure / 3.2808399;
        }
        else if (input.equals("yd")){
            measure = measure /  1.0936133;
        }
        if (output.equals("mm")){
            measure = measure * 1000;
        }
        else if (output.equals("cm")){
            measure = measure * 100;
        }
        else if (output.equals("mi")){
            measure = measure * 0.000621371192;
        }
        else if (output.equals ("in")){
            measure = measure * 39.3700787;
        }
        else if (output.equals ("km")){
            measure = measure * 0.001;
        }
        else if (output.equals ("ft")){
            measure = measure * 3.2808399;
        }
        else if (output.equals ("yd")){
            measure = measure * 1.0936133;
        }

        System.out.println (measure + " " + output);
    }
}

