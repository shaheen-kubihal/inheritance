package inheritance;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("The puppy plays.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); // Inherited from Animal class
        puppy.bark(); // Inherited from Dog class
        puppy.play(); // Specific to Puppy class
    }
}
