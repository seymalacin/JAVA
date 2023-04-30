package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {


        //Post Increment ==> Post sonra demek ( artirmayı sonra yapar)
        int a = 5;
        int b = a++;

        System.out.println(b);//5
        System.out.println(a);//6

        //Pre Increment ==> Pre once demek (artırmayı once yapar)
        int c = 10;
        int d = ++c;
        System.out.println(d);//11                                       ş
        System.out.println(c);//11

        //Post Decrement ==>  decrement -azaltma (sonra azaltma)
        int e = 20;
        int f = e--;
        System.out.println(f);//20
        System.out.println(e);//19

        //Pre Decrement ==> once azaltma
        int h = 30;
        int i = --h;
        System.out.println(i);//29
        System.out.println(h);//29


    }
}
