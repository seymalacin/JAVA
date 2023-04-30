package day12loops;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

//        //while-loop için loop body'si içindeki kodun hiç çalıştırılmama ihtimali vardır.
//        //zero execution mümkündür.
//        int i = 1;
//        while (i < 1) {
//            System.out.println("While loop");
//            i++;
//        }
//
//        //do-while-loop'un body'si içindeki kod her halükarda en az bir kere çalışır.
//        //zero execution mümkün değildir.                         şş
//        int k = 1;
//        do {
//            System.out.println("do-while loop");
//            k++;
//        } while (k < 1);
//
//        //Example 1: Bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz.
//        //           24.5673 ==> 5+6+7+3 = 21
//        double num = 24.5673;
//        System.out.println(num);
//
//        //String.valueOf() methodu parantezin içine konulan datanın tipini String yapar.
//        String str = String.valueOf(num);
//        System.out.println(str);
//
//        //Regex için nokta kullandığınızda önüne "\\" koyunuz. Yani nokta "\\." şeklinde kullanılır.
//        String decimalPart = str.split("\\.")[1];
//        System.out.println(decimalPart);//5673
//
//
//        int decimalInt = Integer.valueOf(decimalPart);
//        System.out.println(decimalInt);//5673
//
//        int sum = 0;
//        do {
//            sum = sum + decimalInt % 10;
//            decimalInt = decimalInt / 10;
//        } while (decimalInt > 0);
//        System.out.println(sum);
//

//        int num1 = 1;
//
//        do {
//
//            System.out.print(num1 + " ");
//
//            num1++;
//
//        } while (num1 < 4);

//        int num2 = 1;
//
//        do {
//
//            System.out.print(num2 + " ");
//
//            num++;
//
//        } while (num2 < 1);
//
//        int num3 = 1;
//
//        do {
//
//            System.out.print(num3 + " ");
//
//            num3++;
//
//        } while (num3 < 2);
//
//        int numA = 4;
//
//        while (numA < 3) {
//
//            System.out.print(numA);
//
//            numA++;
//
//        }
//
//
//        int numB = 4;
//
//        do {
//
//            System.out.print(numB);
//
//            numB++;
//
//        } while (numB < 3);

//        int num = 2;
//
//        do {
//
//            System.out.print(num + " ");
//
//            num++;
//
//        } while (num > 2);
//
//        int num = 0;
//
//        do {
//
//            System.out.print(num + " ");
//
//            num += 2;
//
//        } while (num < 8);

//

//        Scanner scan = new Scanner(System.in);
//
//        String password = "";
//
//
//        do {
//
//            System.out.println("Passwordunuzu giriniz");
//
//            password = scan.nextLine();
//
//
//            if (password.equals("AliCan")) {
//
//                System.out.println("Dogru");
//
//            } else {
//
//                System.out.println("Yanlis");
//
//            }
//
//
//        } while (!(password.equals("AliCan")));
        int product = 1;

        int num = 1;

        while (num < 5) {

            product = product * num;

            num++;

        }

        System.out.println(product);
    }
}
