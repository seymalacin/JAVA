package day12loops;

public class Deneme03 {
    public static void main(String[] args) {


        /*
                       *
                      * *
                     *   *
                    *     *
                   *********
         */


        for (int i = 1; i <= 10; i++) {//sutun
            for (int j = 1; j <= 10; j++) {//satir

                if ((i == 1 && j == 6) || (i == 2 && (j == 5 || j == 7)) || (i == 3 && (j == 4 || j == 8))
                        || (i == 4 && (j == 3 || j == 9)) || i == 5 && (j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7 || j == 8 || j == 9 || j == 10)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
