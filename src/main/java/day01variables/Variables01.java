package day01variables;

public class Variables01 {


    // Variable nasıl oluşturulur?
    // 1) Access modifier   2)data type   3)variable ismi   4) =     5)deger    6);

    // Java da ";" İngilizce deki "." gibidir.
    // İngilizce de "cümle" deriz Java'da "statement" deriz.
    // "=" sembolü "Assigment Operator" olarak adlandırılır.
    // "Assigment Operator" Sağdaki değer alır soldaki variable'in içine koyar.

    public int age = 13;

    public int height = 183;


                                //Java'da data Type'lari

    /*
                                   Primitive Data Types

       1)int: Integer'in kısaltması. Integer tam sayı demektir. (32 bit kullanılır.)
              Matematik'de tam sayıların basi ve sonu yoktur. fakat Java'da tam sayıların başı ve sonu vardir.
              En küçük int = -2,147,483,648
              En büyük int =  2,147,483,647

       2)byte:Tamsayılar için kullanılır. (8 bit kullanır.)
              En küçük byte = -128
              En büyük byte =  127

       3)short: Tamsayılar içindir. (16 bit kullanır.)
                En küçük short = -32768
                En büyük short =  32767

       4)long:  Tamsayılar içindir. (64 bit kullanır.)
                En küçük long = -9,223,372,036,854,755,808
                En büyük long =  9,223,372,036,854,755,807

       5)float: Ondalık sayılar içindir. (32 bit kullanılır)
                "float" virgülden sonra 7 basamak içerebilir.
                "float" değerlerinde sona "f" veya "F" koymanız gerekir.

       6)double: Ondalık sayılar içindir. (64 bit kullanılır)
                 "double" virgülden sonra 16 basamak içerebilir.

       7)boolean: "true" veya "false" değerleri için kullanılır. 1 bit kullanır.

       8)char: Tek karakterler için kullanılır. 16 bit kullanır.
               A, c, 2, ?, _, =,
               Note: "char" lara değer verirken değeri tek 'tırnak arasına' koyunuz yoksa hata verir.

               Note: Java büyük ve küçük harflere duyarlidir.
                     Java için TRUE ile true tamamen farklidır.

       Note: Numeric Data Types:  byte < short < int < long < float < double'dan  memory'i az kullanır.
             Numeric Olmayan Data Types: boolean - char

                                               Non-Primitive Data Types

       String: Isim, adres, kimlik numarası gibi bir veya birden fazla karakter içeren değerlerde kullanılır.
               String değerleri mutlaka çift tırnak arasına konulmalıdır.
               String non-primitive dir. Yani  bir String olusturdugunuzda Java size bir sürü method verir.

               Primitive ile Non-Primitive lerin farkı nedir?

               1)Non-primitive data type'larında degerin yanında method'lar vardır.
               Primitive daha type'larında ise sadece deger vardir,method yoktur.

               2)Primitive data type'ları Java tarafından oluşturulmuştur. toplam 8 tanedir. Biz Primitive data olusturamayız.
               Non-Primitive data type'ları Java tarafından da oluşturulmuştır, biz de olusturabiliriz. Non-Primitive
               sayılamayacak kadar coktur, cunku her developer Non-Primitive data type oluşturabilir.

               3)Primitive data type isimleri kucuk harflerle baslar.
                Non-Primitive data type isimleri buyuk harfle baslar.

               4)Primitive data type'lar memory'de farkli buyuklukte yerler kullanir.
                Non-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirlar.




    */
    public byte price = 12;

    public short populationOfVillage = 23000;

    //Siz "long" demenize rağmen Java verilen sayıyı "int" kabul eder.
    //Bu yüzden long bir variable'a "int" aralığın dışında bir sayı verirseniz mutlaka sonuna "L" veya "l" koyunuz.
    public long populationOfWorld = 7000000000L;

    //buarada "L" koymadığımız halde problem yok. Çünkü "1234" int aralıgına uyar.
    public long x = 1234;

    public float priceOfShirt = 13.99F;

    public double weightOfCell = 0.000012045;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name = "Tom Hanks";

    //Note: "main method" arabanın motoru gibidir.
    //      "main method" çalısmadan hicbirsey calismaz.
    public static void main(String[] args) {

    }


}