package day29abstractioncollections;

/*
  "abstract method'lar" sadece ne yapıcanı soyler (what to do)
  "concrete method'lar" ne yapıacagi ile birikte nasi yapilacani(how to do) da ssoyler

  "interface" ler bir yapilacaklar isler listesidir. (to do list)


 "Multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz bu methodlarin
  return type'lari ayni olmalidir. aksi taktirde

"interface"lerde constructor olmaigi icin interface'lerde object olusturulmaz.
"abstract class" larda cass olduklari icin constructor vardir. Ama constructor lar abstract class'larda object olusturmazlar.

 */


/*
***interwievvv****
      Soru: "Abstract Class" ile "Interface" in farklari nelerdir?
       1)Method
            "Abstract Class" hem abstract hem de concrete method lar icerebilir.
            "Interface" ler ise sadece abstract method'lar icerir.
            Ama istersek interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method lar olusturabiliriz.

       2)Variable
            "Abstract Class" larda normal Class'lardaki gibi her turlu variable olusturulabilir.
            "Interface" lerde ise variable'lar public static ve final olmak zorundadir.

       3)Inheritance
            "Abstract Class" lar class olduklari icin multiple inheritance'a musaade etmezle.
            "Interface" ler ise multiple inheritance'i desteklerler.

       4)Object Creation
            "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
            "Interface" lerde ise constructor olmadigindan object olusturulamaz.

                 Soru: Object Oriented Programming Language prensipleri nelerdir?
                i)Inheritance  ii)Polymorphism  iii)Encapsulation   iv)Abstraction



 */
public class Civic implements Engine, Ac {

    @Override
    public void run() {
        System.out.println("Civic runs well");
    }

}

