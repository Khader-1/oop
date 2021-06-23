package dev.marwan.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        setWidth(width);
        setHeight(height);
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (height + width) * 2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0)
            this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0)
            this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [" + super.toString() + "height=" + height + ", width=" + width + "]";
    }

}
