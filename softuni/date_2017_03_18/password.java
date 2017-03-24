package com.company;

import java.util.Scanner;

class password {
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



