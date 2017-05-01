package date_2017_04_18;

/**
 * Created by svetla on 10.04.17.
 */
class p1_1_rectangle_of_10_x_10_stars {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(repeatStr("*", 10));
        }
    }


    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
