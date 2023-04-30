package day21accessmodifiersinheritance;

public class AnimalRunner {

    /*
     1)"Inheritance " sayesinde
     i)Code tekrarlarindan kurtuluruz
     ii)Code tamiri(maintenance) kolay olur
     iii)Child Class'lari daha atomic yapmis oluruz

     2)Bir Class'i baska bir Classs'in Child Class'i yapmak icin
     "extends" keyword kullanilir. Ilk yazilan Class Child, ikinci
     yazilan Class parent olur.

     3)Child Class object'leri Parent Class'dan method ve variable'lari
     kullanabilirler.

     4)Parent Class object'leri Child Class'dan method ve variable'lari
     kullanamazlar.

     5)Object Class her Class'in parant'idir.
     Java'da  Object Class haricher Class'in parent' vardir
     Java'da parent'i olmayan tek Class Object Class dir

     6)"private" method ve variable'lar Child Class'lar tarafindan kulllanilmaz
     "protected" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
     "default"  method ve variable'lar ayni package'deki  Child Class'lar tarafindan kullanilabilir.
     "public"  method ve variable'lar Child Class'lar tarafindan kullanilabilir.

     NOTE: "Child Class'lar tarafindan kullanabilir " olmak "inherit edilebilir" demektir

     7)4 tip inheritance vardir
     i) Multilevel Inheritance :java bunu kabul eder
     ii)Hierarchical Inheritance: bir parent icin coklu child, java bunu kabul eder.
     iii) Multiple Inheritance: Bir Child'a Parent , java bunu desteklemez.(java does not support Multiple Inheritance)
     iv)Single Inheritance: Bir Child Cass icin bir Parent Class demektir , java bunu destekler.

     */
    public static void main(String[] args) {

        Cat c1 = new Cat();

        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();

        Animal a1 = new Animal();


    }
}
