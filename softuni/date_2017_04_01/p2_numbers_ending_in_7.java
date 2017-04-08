package date_2017_04_01;

/**
 * Created by svetlana on 1.4.2017 г..
 */
public class p2_numbers_ending_in_7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000 ; i++) {
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
