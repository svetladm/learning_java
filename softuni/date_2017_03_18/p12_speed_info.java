package date_2017_03_18;


        import java.util.Scanner;

class p12_speed_info {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double speed = Double.parseDouble (scan.nextLine ());

        if (speed <= 10){
            System.out.println ("slow");
        }
        else if (speed <= 50){
            System.out.println ("average");
        }
        else if (speed <= 150){
            System.out.println ("fast");
        }
        else if (speed <= 1000){
            System.out.println ("ultra fast");
        }
        else{
            System.out.println ("extremely fast");
        }
    }
}
