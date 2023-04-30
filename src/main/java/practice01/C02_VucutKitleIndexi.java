package practice01;

import java.util.Scanner;

public class C02_VucutKitleIndexi {

                         //1
       /*
       Kullanicidan kilosunu ve boyunu alip
       Vucut kitle indeksini hesaplayan bir program yaziniz.
       Ipucu : Vucut
       Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
       ORNEK:
       INPUT      : Kilo: 71
                    Boy: 1,72
       OUTPUT  : Vucut Kitle Indeksiniz : 23

          */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen kg olarak kilonuzu giriniz : ");
        double agirlik = input.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz : ");
        double uzunluk = input.nextDouble();

        uzunluk = uzunluk / 100;

        double vki = agirlik / (uzunluk * uzunluk);
        System.out.println("Vucut kitle indexiniz : " + vki);

                      //2

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         * vize1=80
         * vize2=90
         * Final=70
         * Ornek cikti=74.5
         */

        Scanner input2 = new Scanner(System.in);

        int vize1;
        int vize2;
        int finalnotu;

        System.out.println("vize1 : ");
        vize1 = input2.nextInt();

        System.out.println("vize2 : ");
        vize2 = input2.nextInt();

        System.out.println("Final notu ");

                 //3

        //Kullanıcıya günde ne kadar çay içtiğini ve
        // ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
         //1 şeker = 1.7 gr
        //Örnek Çıktı:
        //5 cay
       //2 seker
       //Yılda 6.205 kg şeker kullanıyor.


        Scanner input3 =new Scanner(System.in);

        System.out.println("Lutfen gunde ictiginiz cay miktarini giriniz : ");
        double cay=input3.nextDouble();

        System.out.println("Lutfen kullandıgınız seke miktarini giriniz :");
        double seker =input3.nextDouble();

        double sekergr= (cay*seker*365*1.7)/1000;
        System.out.println("Bir yilda  " + sekergr + "kg seker kullaniyor");


                     //4



        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word/next() sadece ilk kelimeyi okuyabilir
        // nextLine() can read the whole line/nextLine() tüm satırı okuyabilir

            Scanner input4=new Scanner(System.in);

            System.out.println("isminiz :");
            String isim=input4.nextLine();

            System.out.println("memleket :");
            String memleket=input4.nextLine();

            System.out.println("sunaki konumunuz :");
            String konum=input4.nextLine();

            System.out.println("yasınız :");
            byte yas=input4.nextByte();

            System.out.println("Boyunuz : ");
            short boy= input4.nextShort();

            System.out.println("yasadiginiz " + konum + "seviyormusunuz? ");
            boolean seviyorMu=input4.hasNextBoolean();

            System.out.println("********************");

            System.out.println("isim = " + isim);
            System.out.println("memleketınız  = " + memleket);
            System.out.println("suanki konumunuz  = " + konum);
            System.out.println("yasinız  = " + yas);
            System.out.println("boyunuz  = " + boy );
            System.out.println("yasadiginiz yeri seviyormusunuz  = " + seviyorMu);

        }




    }



