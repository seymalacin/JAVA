package day14arraysforeachloop.day23inheritancepolymorphism;

public class Animal {

    public void eat() {
        System.out.println("Animals eat");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply(int a, int b) {
        return a * b;
    }

    //Aasgidaki method "Overriding Method"
    public Animal create() {
        return new Animal();
    }

    //"final" methodlar Override edilemezler
    public final double divide(int a, int b) {
        return a / b;
    }
}
