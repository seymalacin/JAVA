package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

               //startWith
        String a = "Java kolaydır.";
        //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
       //"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
       boolean b = a.startsWith("kola", 5);
        System.out.println(b);

                //repaceFirst()
        //replaceFirst("a" , "*"); kod Stringdeki ik "a" yi "*" e cevirir.
        //replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
        String c = a.replaceFirst("a" , "*");
        System.out.println(c);//j*va kolaydır

                 //concat()
        //concat() method'u iki tane Strin'i birbirine yapistirmaya yarar
        // "Concatenation" islemi iki turu yapılabılır ; i)+ ile ii)concat() ile// + "anladın mı" gıbı
        //Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
        // concat methodu her zaman en sona ekler
        String d = a.concat(" Anadın mi?");
        System.out.println(d);//java kolaydır.  Anladın mı?

                  //trim
        String e = "     Tom Hanks    ";
        System.out.println(e);
        //trim() methodu bir Stringin bas ve sonundaki "space" characterlerini siler,arada ki "space " characterlerine dokunmaz
        // trim demek kesmek kırpmak anamında
        // space bosuk demek
         String f = e.trim();
        System.out.println(f);

             //  compareTo
        String h = "java";
        String i = "lava";
        //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        //Buyuk harf e duyarlidir.
        //Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.
         int k =h.compareTo(i);
        System.out.println(k);

                 //a.repeat()
        //a.repeat(5); kodu "a" Stringini 5 kere yapıstırır
        //repeat(0); empty string return eder.
        //java dokumente ulasmak ıcın **************windows == ctrl basili tut java dokumente ne ulasma mausla method ısmıne bas  *****************************
        String n = a.repeat(3);
        System.out.println(n);




    }
}
