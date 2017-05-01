package learning_java.softuni.date_2017_03_01_Examples;

import java.text.DecimalFormat;
import java.util.Scanner;

class print_round_numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double d = 45.456;
        double c = 45.654;
        int e = 5;

        System.out.println(" //  double d = 45.456; '%.2f%n' -> колко знака след запетая ");
        System.out.printf("%.2f%n", d);
        System.out.printf("%.0f%n", d);
        System.out.printf("%.3f%%", d); // добавя знака '%' след числото
        System.out.println();
        System.out.printf("%.0f%%%n", d); // добавя знака '%' след числото и минава на нов ред
        System.out.println();

        System.out.println("     // указва с колко цифри да е числото - добавя 0 , работи само за int");
        System.out.printf("%04d%n", e); // добавя 0 / работи само за int
        System.out.println();

        System.out.println("    //double d = 45.456;" + "  double c = 45.654;");

        System.out.println(Math.floor(d) + "    //Math.floor");
        System.out.println(Math.floor(c));

        System.out.println(Math.ceil(d) + "    //Math.ceil");
        System.out.println(Math.ceil(c));

        DecimalFormat df1 = new DecimalFormat("#.00");
        System.out.println(df1.format(Math.ceil(c)) + "     //Math.ceil+Decimal.format");
        System.out.println("    //Math.round");
        System.out.println(Math.round(d));
        System.out.println(Math.round(c));
        System.out.println();

        System.out.println("    //DecimalFormat -> vryshta stojnost String-> c = 45.654 ; e=5");
        DecimalFormat df2 = new DecimalFormat("#.#"); // kolkoto # dobavish sled 0 do tolkova znaka shte ti zakrugli ako nqma znachi i e tochno chislo si go otpechatva
        DecimalFormat df3 = new DecimalFormat("000.000");
        DecimalFormat df4 = new DecimalFormat("-###,###,000.000");
        DecimalFormat df5 = new DecimalFormat("%"); // *100 + "%"
        DecimalFormat df6 = new DecimalFormat("\u00A5##,###"); //Unicode value - specifishen znak ot tablica
        DecimalFormat df7 = new DecimalFormat("$ ###,###.###");


        System.out.println(df2.format(c) + "        //  #.#");
        System.out.println(df2.format(e));
        System.out.println(df3.format(c) + "     //  000.000");
        System.out.println(df3.format(e));
        System.out.println(df4.format(123456789) + "    //  -###,###,000.000");
        System.out.println(df4.format(e));
        System.out.println(df5.format(c) + "  //  % , umnojava po 100 i dolepya procent ");
        System.out.println(df5.format(c / 100));
        System.out.println(df6.format(c) + "   //    \u00A5##,###");
        System.out.println(df7.format(c) + "    //  $ ###,###.###");


    }
}