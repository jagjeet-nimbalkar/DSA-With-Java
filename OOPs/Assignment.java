package OOPs;

public class Assignment {
    public static void main(String[] args) {
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 5);

        Complex e = Complex.add(c, d);
        Complex f = Complex.substract(c, d);
        Complex g = Complex.multiply(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}

class Complex {
    int real;
    int img;

    Complex(int r, int i) {
        real = r;
        img = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex substract(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public static Complex multiply(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.img * b.img)), ((a.real * b.real) + (a.img * b.img)));
    }

    public void printComplex() {
        if (real == 0 && img != 0) {
            System.out.println(img + "i");
        } else if (img == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + img + "i");
        }
    }
}