package day29abstractioncollections;

public interface Engine extends Vehicle {

    //Child         Parent
    //Class --->   Interface   ==>  implements
    //Class --->    Class      ==>   extends
    //Interface ---> Interface ==>   extends
    //Interface ---> Cass      ==>   Mumkun degil


    //interface'lerdeki tum variabeler otomatik olarak (default)"public" dir
    //interface'lerdeki tum variabeler otomatik olarak (default)"final" dir
    //interface'lerdeki tum variabeler otomatik olarak (default)"static" dir

    int price = 2000;

    double weight = 23.5;

    void run();


}
