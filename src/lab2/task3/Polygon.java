package lab2.task3;

public class Polygon {
    private Point[] points;

    // constructor care aloca spatiu pentru n puncte
    Polygon(int n) {
        points = new Point[n];

        for (int i = 0; i < n; i++) {
            points[i] = new Point();
        }
    }

    // constructor care primeste ca parametru un vector cu 2N numere reale
    // si apeleaza constructorul de mai sus pentru completarea vectorului de puncte
    Polygon(float[] coordinates) {
        this(coordinates.length / 2);
        for (int i = 0; i < points.length; i++) {
            points[i].changeCoords(coordinates[2 * i], coordinates[2 * i + 1]);
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < points.length; i++) {
            s += points[i].toString();
            s += "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        float[] coords = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f};
        Polygon p = new Polygon(coords);
        System.out.println(p);
    }
}
