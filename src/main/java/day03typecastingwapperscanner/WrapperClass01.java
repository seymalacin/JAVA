package day03typecastingwapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
     Note:  java primitive'lere method'lar eklleyere yeni bir
             yapı olusturdu, bu yapıya "Wrapper Clas"

             Primitive   Wrapper
             byte     ==>  Byte
             short    ==>   Short
           *  int      ==>   Integer
             long     ==>  Long
             float    ==>  Float
             double   ==> Double
             boolean  ==>  Boolean
            * char     ==>  Character

         */
        byte primitiveByt = 12;//primitıveByte yazip nokta koydugunuzda hic method goremessiniz, cunku primitive'ler method icermez sadece deger icerir

        Byte wrapperByte = 12;//WrapperByte  yazip nokta koydugunuzda cok method gorursunuz, cunku wrapper'lar method  icerir

        //Exampe 1: byte type'inin en kucuk ve en buyuk degerını yazdiriniz.
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        //Example 2: short, int, long data type'larinin en buyuk ve en kucuk degerlerini ekrana yazdiriniz
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //"primitive"ler nasil "wrapper"ara cevrilir (Autoboxing)
        float f1 = 13.99F;

        Float wrapperF1 = f1;

        //"wrapper"lar  nasil "primitive"lere cevrilir (Unboxing)
        Character w1 = 's';
        char primitiveW1 = w1;

        //Note: Autoboxing ve Unboxing java tarafindan otomatik oarak yapılır


    }

}
