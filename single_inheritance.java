package inheritance;

class single_inheritance1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends single_inheritance1 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal class
        dog.bark(); // Specific to Dog class
    }
}
