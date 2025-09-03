package OOPs;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        // Animal->Horse
        h.eat();
        h.walk();
        h.changeColor(); // change color before printing
        System.out.println(h.color); // prints "White"

        System.out.println();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Animal a = new Animal(); // ❌ Cannot instantiate abstract class
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "black";
    }

    void eat() {
        System.out.println("Animal eats for living");
    }

    abstract void walk(); // abstract method
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse class");
    }

    void changeColor() {
        color = "White";
    }

    void walk() {
        System.out.println("I run faster");
    }

}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walk on legs");
    }
}