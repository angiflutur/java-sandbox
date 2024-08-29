package lab3;

import java.awt.*;
import java.util.Objects;

public class Triangle extends Form {
    private float height;
    private float base;

    // constructor fara parametri
    public Triangle() {
        super();
        this.height = 0.0f;
        this.base = 0.0f;
    }

    // constructor cu parametri
    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    // suprascrierea metodei getArea() din clasa de baza Form
    @Override
    public float getArea() {
        return (height * base) / 2;
    }

    // suprascrierea metodei toString()
    // utilizand implementarea toString din clasa de baza
    @Override
    public String toString() {
        return "TRIANGLE: " + super.toString() + ", height: " + height + ", base: " + base;
    }

    // metoda equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Triangle triangle))
            return false;
        return
                Float.compare(height, triangle.height) == 0 && Float.compare(base, triangle.base) == 0;
    }

    // task 5 - metoda printTriangleDimensions
    public void printTriangleDimensions() {
        System.out.println("TRIANGLE Height: " + this.height + ", Base: " + this.base);
    }

    // task 6
    @Override
    public void formDimensions() {
        System.out.println("TRIANGLE Height: " + this.height + ", Base: " + this.base);
    }
}
