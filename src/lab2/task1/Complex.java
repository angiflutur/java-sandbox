package lab2.task1;

public class Complex {
    private int real;
    private int imaginary;

    // constructor cu 2 parametri
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // constructor fara parametri
    // care apeleaza primul constructor cu valorile 0,0
    // (apelul altui constructor se face cu cuvantul cheie `this`)
    public Complex() {
        this(0, 0);
    }

    // copy constructor
    // care primeste ca parametru un ob. Complex, copiat in this
    public Complex(Complex obj) {
        this.real = obj.real;
        this.imaginary = obj.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex obj) {
        this.real += obj.getReal();
        this.imaginary += obj.getImaginary();
    }

    public void showNumber() {
        if(imaginary > 0)
        {
            System.out.println(real + " + i * " + imaginary);
        }
        else if(imaginary < 0)
        {
            System.out.println(real + " - i * " + (-imaginary));
        }
        else{
            System.out.println(real);
        }
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, -2);

        System.out.print("c1: ");
        c1.showNumber();

        System.out.print("c2: ");
        c2.showNumber();

        c1.addWithComplex(c2);

        System.out.print("c1 + c2: ");
        c1.showNumber();
    }
}
