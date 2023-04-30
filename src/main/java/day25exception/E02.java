package day25exception;

public class E02 {
    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getElementFromArray(arr, 2);//Veli
        getElementFromArray(arr, 0);//Ali
        getElementFromArray(arr, 4);//ArrayIndexOutOfBoundsException

    }

    //Bir String Array'den index girerek ede edebilmek icin bir method olusturun
    public static void getElementFromArray(String arr[], int idx) {
        try {
            System.out.println(arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //bu benim teknik olmayan aciklamam
            System.out.println("Array index'de bir problem meydana geldi ==>" + e.getMessage());//Index 4 out of bounds for length 4

            //Exception ile ilgili detaylica teknik msj verir
            e.printStackTrace();

            //Hata msjini diger msjlardan ayirmak ,c,n kulaniriz
            System.out.println("Array index te bir problem yasandi");
        }

    }
}
