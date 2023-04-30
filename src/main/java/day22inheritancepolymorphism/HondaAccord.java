package day22inheritancepolymorphism;

public class HondaAccord extends Honda {

    /*
    1) Siz Class olusturdugunuzda java otomatik olarak contructor verir,cunku
    Java, Class.2in bir kalip oldugunu ve Object olusturmak ,c,n yaratildigini ve Object olusturmak icin
    constractor'in sart oldugunu bilir
    2) Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a "default constructor" denir
    3) Siz kendiniz herhangi bir constructor olusturdugunuzda Java "default constructor" i siler
    4) Bir Class'da birden fazla constructor oabilir. Fakat bu constructor'larin parametre'leri farkli omalidir
    5) "this" keyword "Bu Class" anamindadir. "this.price" demek bu Cass'daki "price" isimli veriable demektir
    "this.price" syntax'i constructor'arin icinde kullanilir.
    6) Conctructor kullanarak variable'lar uzerinde yaptıgınızdegısımler sadece aoabject veriable'larin degerlerini degistirir.
    Class daki veriable degerlerini degistirilmez..

     */
    public int price;
    public int year;
    public String make;
    public String model;


    public HondaAccord() {

    }

    public HondaAccord(int price) {
        this.price = price;

    }

    public HondaAccord(int price, int year) {

        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");

    }

    public HondaAccord(int price, int year, String make, String model) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;


    }
}
