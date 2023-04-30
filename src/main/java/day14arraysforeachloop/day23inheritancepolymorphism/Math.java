package day14arraysforeachloop.day23inheritancepolymorphism;

public class Math extends Courses {

    public void practice() {
        System.out.println("Sove questions");

    }

    public Math() {
        super("X");//perint a git paremetresız olani al
        System.out.println("Constructor 1");
    }

    public Math(int a) {
        this();// aynı clasın ıcınde diger constructoru kulan
        System.out.println("Constructor 2");
    }
}
