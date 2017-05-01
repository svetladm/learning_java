package learning_java.softuni.date_2017_03_01_Examples;

import java.util.Scanner;

/**
 * Created by svetlana on 23.4.2017 г..
 */
public class loops {
    public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int n = Integer.parseInt(console.nextLine());

            for (int i = n; i >=1 ; i--) {
                System.out.println(i);
                for (int j = 0; j <n ; j++) {
                    System.out.println("i"+j+"j"+i);
                    System.out.println(i+" "+(j));
                }
            }
            for (int i = 0; i <n ; i++) {
                System.out.println(i);
            }
        }
    }
