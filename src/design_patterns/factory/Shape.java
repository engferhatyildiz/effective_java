package design_patterns.factory;

public abstract class Shape {
    public abstract void draw();

    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        throw new IllegalArgumentException("Unknown shape type");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

