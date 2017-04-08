package date_2017_04_01;

import java.util.Scanner;

/**
 * Created by svetlana on 2.4.2017 г..
 */
public class p8_odd_even_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());
        int oddsum = 0;
        int evensum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine ());
            if (i % 2 == 0){
            oddsum += num;
            }else{
                evensum += num;
            }
        }
       if (oddsum == evensum){
           System.out.println("Yes Sum = " + oddsum);
       }else if (oddsum != evensum) {
           System.out.println("No Diff = " + Math.abs(oddsum - evensum));
       }
    }
}
