package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {

        /*
          1)"StringBuilder" Java'da bir Class'dir.
          2)"StringBuilder", String olusturmaya yarar
          3)"String" Cllass varken nicin "StringBuilder"a ihtiyac duyariz?
          cunku "String" Class "Immutable Class" (degismeyen) dir, ama biz bazen "Mutable"(degisime acik) String'lere ihtiyac duyariz,
          StringBuilder bize "Mutable" String verir.
          4)"Immutable Class" larda var olan deger degisrilemez.Siz var olan bir degeri degistirmek istedinizde
          i) Memori'de yeni bir variable yeni degerle olusturulur
          ii)Eski variablenin pointer'i yeni veriable'a döndurulur
          iii)Eger bir veriable 'i hicbir pointer gostermiyosa o veriable "Garbage Collector" tarafindan silinir

          "Mutable Class" larda var olan deger degistirilebilir.Ojinal deger korunmaz

          5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
          Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
          kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
          etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in
          degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
          yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.
         */

        String str = "Java";
        str = "Super Java";

        // StringBuilder nasil olusturulur?
        // 1.yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);//java

        // 2.yol:
        StringBuilder strb2 = new StringBuilder();

        //yol a:
        strb2.append("Java");
        strb2.append("is esay");
        strb2.append("!!!");
        System.out.println(strb2);//java  Javais esay!!!

        //Yol b:
        strb2.append(" Learn").append(" Java earn").append(" money.");//Method Chain //append ekleme yapar
        System.out.println(strb2);

        //StringBuilder'larda character sayisi nasil bulunur? ==> length() method'u ile bulunur
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);//3

        //Capacity asimlarinda capacity var olanin iki katinin iki fazlasina cikar
        int capacity1 = strb3.capacity();//capacity 16 dir
        System.out.println(capacity1);//34 ==> 16*2 + 2

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);//70 ==> 34*2 + 2

        //setCharAt(2, 'r'); ==> Index 2'deki character'i "r" ye cevirir.
        strb3.setCharAt(2, 'r');
        System.out.println(strb3);//Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //delete(3, 18); ==> Index 3(dahil) den index 18(haric) e kadar tum characterleri siler
        strb3.delete(3, 18);
        System.out.println(strb3);//Carmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //deleteCharAt(2); ==> Index 2 deki characteri siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);//Cammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //reverse() method'u StringBuilder'i ters cevirir. Ali ==> ilA
        //"mutable" larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir.
        strb3.reverse();//******
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC


        //"Immutable" larda orijinal degeri degistirmek icin method'u kullanmak yetreli olmaz bir de "atama islemi" yapmalisiniz
        String abc = "Java";
        abc = abc.replace("a", "i");//************
        System.out.println(abc);//Java

        //toString() method'u StringBuilder'lari String'e cevirir
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //String'den de StringBuilder'a asagidaki gibi donebilirsiniz
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3, "XXXX"); 3. character den sonra "XXXX" leri koyar // araya koymak
        strb4.insert(3, "XXXX");
        System.out.println(strb4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3, "KLMOPQRSTU", 5, 8); ==> 3. charater'den sonra, "KLMOPQRSTU" String'inin index 5, 6, 7 deki character'lerini yerlestirir
        strb4.insert(3, "KLMOPQRSTU", 5, 8);
        System.out.println(strb4);//mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC


        //a.compareTo(b) method'u i)StringBuilder'lar tamamiyla ayni ise 0 verir.
        //                        ii)"a" alfabetik sirada "b" den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                        iii)"a" alfabetik sirada "b" den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");

        int sonuc = a.compareTo(b);//compare ==> karsilastirma
        System.out.println(sonuc);//0

    }


}

