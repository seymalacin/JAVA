package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
        1))))Farkli sayilardaki parametrelerle calisabilen bir method
          olusturmak isterseniz "varargs" kullanmalisiniz.

        2)))) "varargs" arka tarafta "Array" kullanir. Bu yuzden
              "varargs" larla calisirken "Array" lerle calisiyormus gibi
               davranabilirsiniz.

        3))))) "varargs" olusturmak icin "<data type>... <varargs ismi>"
                veya "<data type> ...<varargs ismi>"

        4))))Bir method'da "varargs" in yaninda baska bir parametre
             kullanilabilir mi?
             "varargs" en sonda olmak sarti ile kullanilir.
        5))))Bir method'da birden fazla "varargs" kullanilabilir mi?
             "varargs" en sonda olmak zorunda oldugundan birden fazla
              kullanirsaniz en az biri en sonda olmayacaktir. Bu da
              4. kural ile celisir.
     */


    public static void main(String[] args) {

        int r1 = add(2, 3);
        System.out.println(r1);

        int r2 = add(2, 3, 4);
        System.out.println(r2);
    }

    // iki sayinin toplamini return eden bir method ousturunuz
    public static int add(int a, int b) {
        return a + b;
    }

    // uc sayinin toplamini return eden bir method ousturunuz
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // dort sayinin toplamini return eden bir method ousturunuz
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //istedigimiz kadar sayiyi toplayabilicemiz method olusturalım
    public static int add(int... a) {  //(int...a) varargs'tir dipsiz kuyu gibidir // varargs'ın arkasınds arreys vardır
        int sum = 0;
        for (int w : a) {
            sum = sum + w;

        }
        return sum; // voir yoksa return yazilir

    }

}
