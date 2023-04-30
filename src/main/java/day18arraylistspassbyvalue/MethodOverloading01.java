package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    /*
       Method Overloading nasil olusturulur?
     1) Method isimleri ayni olmaidir
     2) Method parametreleri farki olmalidir,
       i) Parametre sayilari degistirilebilir
      ii) parametrelerin data tiplerini degistireb,lirsiniz
      iii) parametrelerin yerleri degistirilebilirsiniz ancak
           data typleri farkli ise.
      3) Method Ismi +Parametreler = Method Signature
      4) Method Signatre disinda ne degistirirseniz degisitirin java
         o methodari farkli kabue etmez.
     */
    public static void main(String[] args) {

        add(3, 5);
        add(3, 5.0);

        String s = "Ali";

    }


    public static void add(int a, int b) {

        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }
}