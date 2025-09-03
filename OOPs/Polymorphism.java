// package OOPs;

// // polymorphism
// public class Polymorphism {
// public static void main(String[] args) {
// Calculator cal = new Calculator();
// System.out.println(cal.sum(150, 150));
// System.out.println(cal.sum((float) 8.5, (float) 96.5));
// System.out.println(cal.sum(26, 85, 45));
// //

// Deer d1 = new Deer();
// d1.eat();
// }
// }

// // function overloading
// class Calculator {
// int sum(int a, int b) {
// return a + b;
// }

// float sum(float a, float b) {
// return a + b;
// }

// int sum(int a, int b, int c) {
// return a + b + c;
// }
// }

// // function overriding

// class Animal {
// void eat() {
// System.out.println("Eat veg or non-veg");
// }
// }

// class Deer extends Animal {
// void eat() {
// System.out.println("eat grass");
// }
// }