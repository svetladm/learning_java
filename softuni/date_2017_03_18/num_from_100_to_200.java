package com.company;

import java.util.Scanner;

public class num_from_100_to_200 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int a = Integer.parseInt(scan.nextLine());

        if (a<100){
            System.out.println("Less than 100");
        }
        else if (a>200){
            System.out.println("Greater than 200");
        }
        else if(a>=100){
            System.out.println("Between 100 and 200");
        }
    }
}
