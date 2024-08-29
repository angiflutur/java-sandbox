package lab3;

public class Main {
    public static void main(String[] args) {
        // testare Form
        Form form = new Form();
        System.out.println(form);

        // testare Square
        Square square = new Square();
        Square square2 = new Square(2, "yellow");
        System.out.println(square);
        System.out.println(square2);

        // testare Triangle + equals din Triangle
        Triangle triangle = new Triangle(2, 5, "red");
        System.out.println(triangle.getArea());

        Triangle triangle2 = new Triangle(2, 5, "red");
        System.out.println(triangle.equals(triangle2));

        // TASK 4 - UPCASTING
        Circle circle = new Circle();
        Form[] forms = new Form[]{triangle2, square2, circle};
        for (int i = 0; i < forms.length; i++) {
            System.out.println(forms[i]);
        }

        // TASK 5 - DOWNCASTING
        for(int i = 0; i < forms.length; i++){
            if (forms[i] instanceof Triangle) {
                ((Triangle) forms[i]).printTriangleDimensions();
            } else if (forms[i] instanceof Circle) {
                ((Circle) forms[i]).printCircleDimensions();
            } else if (forms[i] instanceof Square) {
                ((Square) forms[i]).printSquareDimensions();
            }
        }

        // TASK 6 - afisarea dimensiunilor formelor fara a folosi instanceof
        // => adaugam o metoda formDimensions in clasa Form
        // pe care o vom suprascrie in fiecare clasa

        for(int i = 0; i < forms.length; i++){
            forms[i].formDimensions();
        }
    }
}
