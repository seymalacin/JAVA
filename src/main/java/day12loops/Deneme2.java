package day12loops;

public class Deneme2 {
    public static void main(String[] args) {










            /*
             **
             * *
             *  *
             *****

             */


        for (int i = 1; i <= 5; i++) {//sutun
            for (int j = 1; j <= 5; j++) {//satır
                if ((i == 1 && j == 1) || (i == 2 && (j == 1 || j == 2)) || (i == 3 && (j == 1 || j == 3)) ||
                        (i == 4 && (j == 1 || j == 4)) || (i == 5 && (j == 1 || j == 2 || j == 3 || j == 4 || j == 5))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            }
        }


    }

