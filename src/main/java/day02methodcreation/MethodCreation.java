package day02methodcreation;

public class MethodCreation {

    //main method icinde kullanacaginiz hersey "statik" olmalidir.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ucSayiyiCarp(2, 1.5, 6));

        System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 8, 3.2));

        System.out.println(dortSayininTolpamı(1,2,3,4.5));
        System.out.println(ucSayıyıToplaDordunuIleBol(1,2,3.4,4));
        System.out.println(ıkıSayıuıcarp(1,3));

        //sout yazip enter`e basiniz. System.out.println() otomatik olarak yazilir.
        //Ekrana bir sey yazdirmak icin iki tane kod var.
        //i)System.out.println() (ln: "Line" demek. yazdir sonraki satira gec demek.)==> satir basi yapar
        //ii)System.out.print() (yazdiracagimiz her sey ayni satirsa ise bu komut kullanilir ==> satir basi yapmaz.
    }

    //Example 1: Toplama islemi yapan bir method olusturunuz.
    public static double toplamaYap (double a, double b) {
        return a+b;
    }
    //Example 2? uc sayiyi birbiri ile carpan bit method olusturunuz.

    public static double ucSayiyiCarp (double a, double b, double c) {

        return a*b*c;
    }

    //exaple 3: uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup sonucu ekrana yazdiriniz.

    public static double ilkIkiyiToplaUcuncuIleCarp (double a, double b, double c){
        return (a+b)*c;
    }
    //dort syının toplamını ekrana yazınız
    public static double dortSayininTolpamı (double a, double b, double c, double d){

        return a+b+c+d;

    }
   //dort sayının ılk ucunu topla dorduncu ıle bol

    public static double ucSayıyıToplaDordunuIleBol(double a, double b, double c, double d){
        return (a+b+c)/d;
    }
  //ekrana ıkı tam sayının çarpımını yazdırınız
    public static int ıkıSayıuıcarp(int a, int b){
        return a*b;
    }






    }



