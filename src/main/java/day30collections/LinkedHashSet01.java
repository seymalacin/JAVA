package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

    /*
    LinkedHashSet'ler elemanlari ekleme sirasina(Insertion Order)gore yerlestirirler.

     LinkedHashSet'ler elemanlari siralamada zaman harcadigi icin HashSet'lere gore yavas calisir.


     */

    public static void main(String[] args) {

        LinkedHashSet<String> emails = new LinkedHashSet<>();
        emails.add("abc@mail.com");
        emails.add("bca@mail.com");
        emails.add("asc@mail.com");
        emails.add("bde@mail.com");
        emails.add("axy@mail.com");
        System.out.println(emails);//[abc@mail.com, bca@mail.com, asc@mail.com, bde@mail.com, axy@mail.com]
    }
}
