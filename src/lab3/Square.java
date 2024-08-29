package lab3;

import java.awt.*;

public class Square extends Form {
    private float side;

    // constructor fara parametri
    public Square() {
        super();
        this.side = 0;
    }

    // constructor cu parametri
    public Square(float side, String color) {
        super(color);
        this.side = side;
    }

    // suprascrierea metodei getArea() din clasa de baza Form
    @Override
    public float getArea() {
        return side * side;
    }

    // suprascrierea metodei toString()
    // utilizand implementarea toString din clasa de baza
    @Override
    public String toString() {
        return "SQUARE: " + super.toString() + ", side: " + side;
    }

    // task 5 - metoda printCircleDimensions
    public void printSquareDimensions() {
        System.out.println("SQUARE Side: " + this.side);
    }

    // task 6
    public void formDimensions() {
        System.out.println("SQUARE Side: " + this.side);
    }
}
