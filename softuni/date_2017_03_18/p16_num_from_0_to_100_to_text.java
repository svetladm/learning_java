package date_2017_03_18;

import java.util.Scanner;

class p16_num_from_0_to_100_to_text {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int a = 0;
        int b = 0;

        a = num / 10;
        b = num % 10;

        if (num <= 100) {
            if (num >= 0) {

                if (num == 0) {
                    System.out.println("zero");
                } else if (num == 11) {
                    System.out.println("eleven");
                } else if (num == 10) {
                    System.out.println("ten");
                } else if (num == 12) {
                    System.out.println("twelve");
                } else if (num == 13) {
                    System.out.println("thirteen");
                } else if (num == 14) {
                    System.out.println("fourteen");
                } else if (num == 15) {
                    System.out.println("fifteen");
                } else if (num == 16) {
                    System.out.println("sixteen");
                } else if (num == 17) {
                    System.out.println("seventeen");
                } else if (num == 18) {
                    System.out.println("eighteen");
                } else if (num == 19) {
                    System.out.println("nineteen");
                } else if (num == 100) {
                    System.out.println("one hundred");
                } else {

                    if (a == 2) {
                        System.out.print("twenty");
                    } else if (a == 3) {
                        System.out.print("thirty");
                    } else if (a == 4) {
                        System.out.print("forty");
                    } else if (a == 5) {
                        System.out.print("fifty");
                    } else if (a == 6) {
                        System.out.print("sixty");
                    } else if (a == 7) {
                        System.out.print("seventy");
                    } else if (a == 8) {
                        System.out.print("eighty");
                    } else if (a == 9) {
                        System.out.print("ninety");
                    }

                    if (b > 0) {
                        if (a > 0) {
                            System.out.print(" ");
                        }
                    }

                    if (b == 1) {
                        System.out.println("one");
                    } else if (b == 2) {
                        System.out.println("two");
                    } else if (b == 3) {
                        System.out.println("three");
                    } else if (b == 4) {
                        System.out.println("four");
                    } else if (b == 5) {
                        System.out.println("five");
                    } else if (b == 6) {
                        System.out.println("six");
                    } else if (b == 7) {
                        System.out.println("seven");
                    } else if (b == 8) {
                        System.out.println("eight");
                    } else if (b == 9) {
                        System.out.println("nine");
                    }
                }
            } else {
                System.out.println("invalid number");
            }
        } else {
            System.out.println("invalid number");
        }
    }
}

//            if (a == 0) {
//
//                System.out.println("zero");
//                else if (num == 1) {
//                    System.out.println("one");
//                } else if (num == 2) {
//                    System.out.println("two");
//                } else if (num == 3) {
//                    System.out.println("three");
//                } else if (num == 4) {
//                    System.out.println("four");
//                } else if (num == 5) {
//                    System.out.println("five");
//                } else if (num == 6) {
//                    System.out.println("six");
//                } else if (num == 7) {
//                    System.out.println("seven");
//                } else if (num == 8) {
//                    System.out.println("eight");
//                } else if (num == 9) {
//                    System.out.println("nine");
//                } else if (num == 11) {
//                    System.out.println("eleven");
//                } else if (num == 12){
//                    System.out.println("twelve");
//                } else if (num == 13){
//                    System.out.println("thirteen");
//                } else if (num / 10 == 1){
//                    System.out.println((num / 10 ==1) );
//                }else if (num == 15){
//                    System.out.println("fiveteen");
//                }else if (num == 16){
//                    System.out.println("sixteen");
//                }else if (num == 17){
//                    System.out.println("seventeen");
//                }else if (num == 18){
//                    System.out.println("eighteen");
//                }else if (num == 19){
//                    System.out.println("nineteen");
//                }else if (num == 20){
//                    System.out.println("twenty");
//                }else if (num == 30){
//                    System.out.printf("thirty");
//                }else if (num == 40){
//                    System.out.printf("fourty");
//                }else if (num == 50){
//                    System.out.printf("fifty");
//                }else if (num == 60){
//                    System.out.println("sixty");
//                }else if (num == 70){
//                    System.out.printf("seventy" +
//                            "");
//                }
//            }
//            else if (num > 100){
//                System.out.println("invalid number");
//            }
//        }
//    }
//}
