package dev.marwan.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle() {}

    public Circle(double x, double y, double radius) {
        super(x, y);
        setRadius(radius);
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0)
            this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [" + super.toString() + "radius=" + radius + "]";
    }

}
