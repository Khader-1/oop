package dev.marwan.shapes;

public abstract class Shape implements Comparable<Shape> {

    private double x;
    private double y;

    public Shape() {}

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Shape fromString(String text) {
        final String[] chuncks = text.split("\\[");
        String[] args = chuncks[1].split("\\]")[0].split(",");
        final double x = Double.parseDouble(args[0].split("=")[1]); 
        final double y = Double.parseDouble(args[1].split("=")[1]); 
        if(chuncks[0] == "Rectangle") {
            final double height = Double.parseDouble(args[2].split("=")[1]); 
            final double width = Double.parseDouble(args[3].split("=")[1]);
            return new Rectangle(x, y, height, width); 
        } else {
            final double radius = Double.parseDouble(args[2].split("=")[1]); 
            return new Circle(x, y, radius); 
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public int compareTo(Shape o) {
        return (int) (getArea() - o.getArea());
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y + ", ";
    }
}
