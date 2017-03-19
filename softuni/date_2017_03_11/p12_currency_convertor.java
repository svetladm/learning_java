package date_2017_03_11;

import java.util.Scanner;

public class p12_currency_convertor {

    static class greetings {

        private static Scanner scan;

        public static void main (String [] args) {
            scan = new Scanner(System.in);

            double sumaZaKonvertirane = Double.parseDouble(scan.nextLine());
            String vhodnaValuta = scan.nextLine ();
            String izhodnaValuta = scan.nextLine ();


            if ("BGN".equals(vhodnaValuta)){
                if ("USD".equals(izhodnaValuta)){
                    double resultat = sumaZaKonvertirane/1.79549;
                    System.out.printf("%.2f %s", resultat, izhodnaValuta);
                }
                else if ("EUR".equals(izhodnaValuta)){
                    double resultat1 = sumaZaKonvertirane/1.95583;
                    System.out.printf("%.2f %s", resultat1, izhodnaValuta);
                }
                else if ("GBP".equals(izhodnaValuta)){
                    double resultat2 = sumaZaKonvertirane/2.53405;
                    System.out.printf("%.2f %s", resultat2, izhodnaValuta);
                }

            }
            else if ("USD".equals(vhodnaValuta)){
                if ("BGN".equals(izhodnaValuta)){
                    double resultat3 = sumaZaKonvertirane*1.79549;
                    System.out.printf("%.2f %s", resultat3, izhodnaValuta);
                }
                else if ("EUR".equals(izhodnaValuta)){
                    double resultat4 = sumaZaKonvertirane*1.79549/1.95583;
                    System.out.printf("%.2f %s", resultat4, izhodnaValuta);
                }
                else if ("GBP".equals(izhodnaValuta)){
                    double resultat5 = sumaZaKonvertirane*1.79549/2.53405;
                    System.out.printf("%.2f %s", resultat5, izhodnaValuta);
                }
            }
            else if ("EUR".equals(vhodnaValuta)){
                if ("BGN".equals(izhodnaValuta)){
                    double resultat6 = sumaZaKonvertirane*1.79549;
                    System.out.printf("%.2f %s", resultat6, izhodnaValuta);
                }
                else if ("USD".equals(izhodnaValuta)){
                    double resultat7 = sumaZaKonvertirane*1.95583/1.79549;
                    System.out.printf("%.2f %s", resultat7, izhodnaValuta);
                }
                else if ("GBP".equals(izhodnaValuta)){
                    double resultat8 = sumaZaKonvertirane*1.95583/2.53405;
                    System.out.printf("%.2f %s", resultat8, izhodnaValuta);
                }
            }
            else if ("GBP".equals(vhodnaValuta)){
                if ("BGN".equals(izhodnaValuta)){
                    double resultat9 = sumaZaKonvertirane*2.53405;
                    System.out.printf("%.2f %s", resultat9, izhodnaValuta);
                }
                else if ("USD".equals(izhodnaValuta)){
                    double resultat10 = sumaZaKonvertirane*2.53405/1.79549;
                    System.out.printf("%.2f %s", resultat10, izhodnaValuta);
                }
                else if ("EUR".equals(izhodnaValuta)){
                    double resultat11 = sumaZaKonvertirane*2.53405/1.95583;
                    System.out.printf("%.2f %s", resultat11, izhodnaValuta);
                }
            }
        }
    }
}
