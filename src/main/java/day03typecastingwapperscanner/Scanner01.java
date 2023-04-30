package day03typecastingwapperscanner;

public class Scanner01 {
    public static class Scanner03 {
        public static void main(String[] args) {

            //Example 1: kulanicidan bir dikdortgenin en ve boyunu alan ve cevresini hesaplayan kodu yaziniz

            java.util.Scanner input = new java.util.Scanner(System.in);

            System.out.println("dikdortgenin kisa kenarini giriniz");

            int en = input.nextInt();

            System.out.println("dikdortgenin uzun kenarini giriniz...");

            int boy = input.nextInt();

            System.out.println("alan" + en * boy);
            System.out.println("cevre" + 2 * (en + boy));

        }
    }
}
