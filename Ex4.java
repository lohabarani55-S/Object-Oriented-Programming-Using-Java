import java.util.Scanner;

abstract class Shape {
    int d1, d2;

    Shape(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    abstract void printArea();
}

class Rectangle extends Shape {

    Rectangle(int d1, int d2) {
        super(d1, d2);
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (d1 * d2));
    }
}

class Triangle extends Shape {

    Triangle(int d1, int d2) {
        super(d1, d2);
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * d1 * d2));
    }
}
class Triangle extends Shape {

    Triangle(int d1, int d2) {
        super(d1, d2);
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * d1 * d2));
    }
}

class Circle extends Shape {

    Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * d1 * d1));
    }
}

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter length and breadth of Rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r = new Rectangle(l, b);

       
        System.out.print("Enter base and height of Triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        Triangle t = new Triangle(base, height);

       
        System.out.print("Enter radius of Circle: ");
        int radius = sc.nextInt();
        Circle c = new Circle(radius);

        System.out.println();
        r.printArea();
        t.printArea();
        c.printArea();

        sc.close();
    }
}
