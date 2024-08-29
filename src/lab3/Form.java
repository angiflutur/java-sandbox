package lab3;

public class Form {
    private String color;

    // constructor fara parametri
    public Form() {
        this.color = "white";
    }

    //constructor cu parametri
    public Form(String color) {
        this.color = color;
    }

    public float getArea() {
        return 0;
    }

    public String toString() {
        return "This form has the color " + this.color;
    }

    public void formDimensions() {}
}
