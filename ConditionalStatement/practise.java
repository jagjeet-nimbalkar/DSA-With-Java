package ConditionalStatement;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        // Write a Java program to get a number from the user and print whether it is
        // positive or negative
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int Num = sc.nextInt();
        if (Num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // Finish the following code so that it prints You have a fever if your
        // temperature is above 100 and otherwise prints You don't have a fever
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("YOu have fever ");
        } else {
            System.out.println("you don't have fever");
        }

        // write a java program to input week nuber(1-7) and print the day of week name
        // using switch case
        System.out.print("Enter Number of day:");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid number");
                break;
        }

        // Write a java program that takes a year form the user and print wether the
        // this is leap year or not
        System.out.print("Enter year:");
        int year = sc.nextInt();

        boolean X = (year % 4) == 0;
        boolean Y = (year % 100) == 0;
        boolean Z = (year % 400) == 0;

        if (X || (Y || Z)) {
            System.out.println(year + "is the leap year");
        } else {
            System.out.println(year + "is not a leap year");
        }
        sc.close();

    }
}
