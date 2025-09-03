
import java.util.Scanner;

public class practise {
    public static void main(String[] args) {

        // int $ = 24;
        // In a program, input 3 numbers:A,B and C.You have to output the average of
        // these 3 numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first no:");
        int num1 = sc.nextInt();
        System.out.print("enter sec no:");
        int num2 = sc.nextInt();
        System.out.print("enter trird no:");
        int num3 = sc.nextInt();

        int avg = (num1 + num2 + num3) / 3;
        System.out.print("Average is here: ");
        System.out.print(avg);

        // In a program,input the side of a square.You have to output the area of the
        // square.
        System.out.print("\n enter side of square:");
        int side = sc.nextInt();
        int area = side * side;
        System.out.print("Area of square:");
        System.out.print(area);

        // Enter cost of 3 items from the user (using float data type)-a pencil,a pen
        // and an eraser. You have to output the total cost of the items back to the
        // user as their bill.(Add on : You can also try adding 18% gst tax to the items
        // in the bill as an advanced problem)

        System.out.print("\nEnter price of pen: ");
        float penCost = sc.nextFloat();

        System.out.print("Enter price of pencil: ");
        float pencilCost = sc.nextFloat();

        System.out.print("Enter price of eraser: ");
        float eraserCost = sc.nextFloat();

        float GST = 0.18f;
        float subtotal = penCost + pencilCost + eraserCost;
        float total = subtotal + (subtotal * GST);

        System.out.print("Your total is: ");
        System.out.print(total);

        sc.close();
    }
}
