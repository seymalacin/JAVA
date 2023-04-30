package day27exceptions;
/*
  Interview sorusu : "final", "finally", "finalize" nedir?
final(keyword): ==> final method override edilemez.
              final variable degeri degistirilemez.
              final class child class sahibi olamaz.
finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.
 */

public class Exceptions01 {
    public static void main(String[] args) {

        double r1 = compereNumOfCaracters("Java", "xy");
        System.out.println(r1);//2.0

        double r2 = compereNumOfCaracters(null, "xy");
        System.out.println(r2);

        double r3 = compereNumOfCaracters("Sellenium", "");
        System.out.println(r3);

    }

    // verien ii stringden birinin karakter sayisinin digerinin kac kati olldugunu veren method ousturunuz
    public static double compereNumOfCaracters(String s, String t) {
        double resut = 0;
        try {
            resut = s.length() / t.length();
        } catch (NullPointerException e) {
            System.out.println("lenght() methodu null ile kullanilamaz");
        } catch (ArithmeticException e) {
            System.out.println("herhangi bir sayisifir ie bolunemez");
        } finally {
            System.out.println("Database ile concation kesidi");
        }
        return resut;
    }
     /*

    Java'da birbirine benzeyen üç tane keyword var:
    "final", "finally", "finalize" açıklayınız
    1)"final" bir keyword'dür. Variable, Class ve Method'lar için kullanılır.
    2)"finally" bir "code block" dur.
      "try-catch" veya sadece "try" ile kullanılır.
      "finally" code block içine yazılan kodlar her halükarda çalıştırılır.
      Mesela Database ile connection'ı kesmek her halükarda yapılması gereken bir eylemdir. Bunu "finally" ile yapabiliriz.
    3)"finalize" bir method'dur. Bu method Java tarafından data'lar imha edilmeden önce çağrılır, bu method data'ları
      imha edilecek hale getirir ve daha sonra "Garbage Collector" bu dataları imha eder.

      "finalize" method'unu Java developer 'lar da cagrilabilir ama Java kendi bildigini yapar.

      */




    /*
    
     */
}
