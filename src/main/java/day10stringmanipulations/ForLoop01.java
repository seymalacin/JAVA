package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: Ekrana 5 kere "Hi" yazdiriniz.

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Tekrarli isler icin "loop" kullaniriz.
        //Dort cesit "loop" var.
        //i) for-loop
        //ii) while-loop
        //iii) do-while-loop
        //iv) for-each-loop


        //i) for-loop
        //Example 2: Ekrana 5 kere "Hi" yazdiriniz.

        // baslangic degeri yazacagiz.loop hangi sart altinda calisacak. Increment(Arttirma) veya Decrement(azaltma)
        for (int i = 1; i < 6; i = i + 1) {
            System.out.println("Hi");
        }

        //Example 3: 4 den 7 ye kadar tum tam sayilari ekrana yazdiran kodu yaziniz

        for (int i = 4; i < 8; i = i + 1) {
            System.out.println(i);
        }
        System.out.println();

        //Example 4: 14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 14; i > 4; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Example 4: 14 den 5 e kadar tum  cift tamsayilari ekrana yazdiran kodu yaziniz
        // cift sayıar: 14 12 10 ....

        //1.yo:
        for (int i = 14; i > 4; i = i - 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2.yol:
        for (int i = 14; i > 4; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //Example 4:28 den 157 e kadar tum   tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 28; i < 158; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Exampe 7: "java" string'ini "j*a*v*a*"stringine ceviren kodu gırınız
        String str = "java";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "*");
        }

        System.out.println();
        //Exampe 8: size verilen stringde tekrarsız karaktereri ekrana yazdırınız
        //         "Hellooo Ali" ==> He Ai

        String s = "Hellooo Ali";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.print(c);//He Ai

            }


        }
    }
}