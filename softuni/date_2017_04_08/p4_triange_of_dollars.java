package date_2017_04_08;

import java.util.Scanner;

    /**
     * Created by svetlana on 8.4.2017 г..
     */
    public class p4_triange_of_dollars {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = Integer.parseInt(scan.nextLine());

            for (int i = 1; i <= n; i++) {
                System.out.println(repeatStr("$ ", i));
            }

//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("$ ");
//                }
//                System.out.println();
//            }
//        }
        }
        static String repeatStr(String strToRepeat, int count) {
            String text = "";

            for (int i = 0; i < count; i++) {
                text = text + strToRepeat;
            }

            return text;
        }
    }

