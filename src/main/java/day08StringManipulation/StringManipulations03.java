package day08StringManipulation;

public class StringManipulations03 {
    public static void main(String[] args) {

        //Example1: bir strinkdeki space haric kac tane character kullanildigini gosteren kodu giriniz
        //          "ali okula gitti." ==> 14

        String str = "ali okula gitti.";

        //replace() methodu bir stringdeki herhangi bir karaktri veya karakterleri degisdirmek için kullanılır.
        int num = str.replace(" ", "").length();
        System.out.println(num);

        //Example 2: bir stringdeki tum 'a' harflerini 'A' ya cevriniz.
        String s = "Ankara'nin tasina gozlerimin yasina bak.";
        String yeniS = s.replace("a", "A");
        System.out.println(yeniS);

        //Example 3: bir stringdeki tum "kara" kelimelerinin yerine "*" koyunuz
        String t = "Kara kara dusunme Ankara";
        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);

        //Example 4: bir stringdeki tum sayılari "*" a cevriniz
        //          "AC202117004" ==> AC*******
        String stdId = "AC202117004";
        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);

        /*
            bir gurup datayı ifade eden kodlara "regex" denir.
            "regex" regular experissions in kisaltilmis halidir.

            1) tum rakamlar ==>[0-9]
            2) tum kucuk harfer ==> [a-z]
            3) tum buyuk harfler ==> [A-Z]
            4) sesli harfler ==> [aeiouAEIOU]
            5) tum harfler ==> [a-zA-Z]
            6) SPACE ==> []
            7)Tum rakamllar ve tum harfller ==> [0-9a-zA-Z]
            8) TUM NOKTALAMA İSARETLERİ ==> \\p{Punct}

            1)Rakamalr hariç tum karakterler ==> [^0-9]
            2)kucuk harfler hariç tum karakterler == [^a-z]
            3)buyuk harfler hariç tum karakterler ==> [^A-Z]
            4) TUM HARFLER HARİÇ TUM KARAKTERLER ==> [^a-zA-Z]
            5)Space hariç ==>[^ ]
            6)[^] => haric demek


         */

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
//           tum karakterlerin sayisini bulan kodu yaziniz

        String u = "Ali 13 yasinda, dersem inanma!...";

        int sonuc = u. //Ali 13 yasinda, dersem inanma!...
                replaceAll("[0-9]", "").//Ali yasinda, dersem inanma!...
                replace(" ", ""). //Aliyasinda, derseminanma!...
                replaceAll("\\p{Punct}", "").//Aliyasindaderseminanma
                length();//22
        System.out.println(sonuc);

        // Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";
        //i)Space haric en az sekiz karakter olmali
        boolean first = pwd.replace(" ", "").length() > 7;

        //ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length() > 0;

        // iii)En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length() > 0;

        //  iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length() > 0;

        //  v)En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length() > 0;

        boolean pwdGecerli = fifth && second && third && fourth && fifth;
        if (pwdGecerli) {
            System.out.println("password' unuz gecerlidir...");
        } else {
            System.out.println("pasword'unuz gecerli degildir...");
        }

        // Example 7: bir stringdeki noktalama isaretleri haric karakter sayısını gosteren kodu giriniz
        String cumle = "sen yapmazsan, ben  ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();

        System.out.println(number);

        //Example 8: verilen bir string "A" ile basliyor "X" ile bitiyorsa ekrana "harika" yazdirin aksi halde "normal yazdirin.

        String v = "Alex";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);


    }
}
