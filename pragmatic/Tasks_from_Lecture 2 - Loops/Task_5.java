/**
 * Print all odd numbers between -10 and 10.
 */

package com.company.Lecture_2;

public class Task_5 {

    public static void main(String[] args){

        int i = -10;

        while (i < 10){
            if(i % 2 != 0) {
                System.out.println (i);
            }
            i = i + 1;
        }
    }
}
