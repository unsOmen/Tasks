package practice_3;

import java.util.Random;

/**
 * Created by OmeN on 28.03.2016.
 */

class Shape {
    public void draw() {};
    public void erase() {};
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

class RandShape {
    private Random rnd = new Random(47);

    public Shape next() {
        switch (rnd.nextInt(3)) {
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            default: return null;
        }
    }
}
public class example_polimorfizm_2 {

    private static RandShape rndShape = new RandShape();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];

        for(int i=0; i<s.length; i++) {
            s[i] = rndShape.next();
        }

        for(Shape shape : s) {
            shape.draw();
        }
    }
}
