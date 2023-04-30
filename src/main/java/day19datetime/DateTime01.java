package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {


        //Example 1: "Anik tarihi"(current data) ekrana yazdıran kodu yaziniz
        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);//2022-10-21

        //Example 1: "Anik zaman"(current Time) ekrana yazdıran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//20:42:05.986986500

        //Example 1:  "Anik tarihi"(current data) "Anik zaman"(current Time) ekrana yazdıran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:45:30.915605900

        //Example 4:japonyadak'i  "Anik tarihi"(current data) "Anik zaman"(current Time) ekrana yazdıran kodu yaziniz
        LocalDateTime currentDataTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDataTimeInJapan);//2022-10-22T02:50:55.006365100

        //Example 5:Istanbuldak'i  "Anik tarihi"(current data) "Anik zaman"(current Time) ekrana yazdıran kodu yaziniz
        LocalDateTime currentDataTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDataTimeInIstanbul);//2022-10-21T20:53:22.341777100

        //Example 6: Bugunden 789 gun sonra emekli olacaniza gore emekilik tarihini hesapayan kodu yaziniz
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate ritİreDate = countDate.plusDays(789);//plus day gun arttır
        System.out.println(ritİreDate);//2024-12-18

        //Example 7:ıkı cocugunuzun dogum tarihleri arasındaki farki gun olarak hesapayan kodu yaziniz
        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        //between(dobAli, dobVeli)methodu kullanildiginda daha eski olan tarih once yazilmalidir
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);//diff = fark
        System.out.println(diff);//2824

        //Example 8: Tom , Ali'den 3 yil 8 ay 13 gun sonra dogdu.Ali ise Veliden 1 yil 15 gun once dogdu.
        // Tom'un dogum tarihi 18 kasim 2011 ise Veli ve Alini dogum tarihlerini bulunuz.

        LocalDate dobTom = LocalDate.of(2011, 11, 18);
        LocalDate dobOfAli = dobTom.plusYears(3).plusMonths(8).plusDays(13);

        //Example 8: Istanbul'un fethi ile cumhuruyetin kurulmasi arasinda kac ay odugunu gosteren kodu yazinin
        //  29 mayıs 1453==istanbuln fethi    29 ekim 1923 ==cumhuriyetin kurulusu

        LocalDate istanbulunFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyetinKurulusu = LocalDate.of(1923, 10, 29);

        Long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi, cumhuriyetinKurulusu);
        System.out.println(aySayisi);//5645

        //Example 9:verlen tarihin hangi burcta oldugunu gosteren kodu yazınız
        LocalDate myDate = LocalDate.of(1999, 7, 9);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if (day < 21) {
            if (month == 7) {
                System.out.println("Yengec");
            }
            if (month == 8) {
                if (day < 20) {
                    System.out.println("Yengec");


                    //////////////////
                    int day1 = myDate.getDayOfMonth();
                    int month2 = myDate.getMonthValue();

                    //1.Yol:
                    if (day >= 21 && month == 3) {
                        System.out.println("Koc");
                    } else if (day <= 20 && month == 4) {
                        System.out.println("Koc");
                    } else if (day >= 21 && month == 4) {
                        System.out.println("Boga");
                    } else if (day <= 20 && month == 5) {
                        System.out.println("Boga");
                    }
                    //2.Yol:
                    if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
                        System.out.println("Koc");
                    } else if ((day >= 21 && month == 4) || (day <= 20 && month == 5)) {
                        System.out.println("Boga");
                    }


                }
            }
        }

    }
}
