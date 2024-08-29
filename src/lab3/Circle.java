package lab3;

public class Circle extends Form {
    private float radius;

    // constructor fara parametri
    public Circle() {
        super();
        this.radius = 0.0f;
    }

    // constructor cu parametri
    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    // suprascrierea metodei getArea() din clasa de baza Form
    @Override
    public float getArea() {
        return 3.14f * radius * radius;
    }

    // suprascrierea metodei toString()
    // utilizand implementarea toString din clasa de baza
    @Override
    public String toString() {
        return "CIRCLE: " + super.toString() + ", radius: " + radius;
    }

    // task 5 - metoda printTCircleDimensions
    public void printCircleDimensions() {
        System.out.println("CIRCLE Radius: " + this.radius);
    }

    // task 6
    public void formDimensions() {
        System.out.println("CIRCLE Radius: " + this.radius);
    }
}
