package com.company;


import java.util.Scanner;

public class time_plus_15_minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes = minutes + 15;

        if (minutes > 59) {
            hour = hour + 1;
            minutes = minutes - 60;
            if (hour == 24){
                hour = 0;
            }
            if (minutes < 10) {
                System.out.println(hour + ":" + "0" + minutes);
            } else {
                System.out.println(hour + ":" + minutes);
            }
        } else {
            System.out.println(hour + ":" + minutes);
        }
    }
}