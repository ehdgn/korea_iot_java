package org.example.test0710.자바OOP구현문제;

abstract class Shape {
   abstract double getArea();
}

class Circle extends Shape {

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        System.out.println("원의 면적: 2 * 3.14 * " + radius);
        return 2*3.14*3;
    }
}

class Rectangle extends Shape {

    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        System.out.println("사각형의 면적: " + width + " * " + height);
        return width * height;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle.getArea());
    }
}
