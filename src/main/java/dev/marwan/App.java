package dev.marwan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import dev.marwan.shapes.Circle;
import dev.marwan.shapes.Rectangle;
import dev.marwan.shapes.Shape;

public class App 
{

    final private static File file = new File("data.txt"); 
    public static void main(String[] args ) throws FileNotFoundException
    {
        final Scanner input = new Scanner(System.in);
        System.out.print("Please enter 1 or 2: ");
        int choice = input.nextInt();
        if(choice == 1) {
            List<Shape> shapes = new ArrayList<Shape>(4);
            shapes.add(new Circle());
            shapes.add(new Circle(0, 0, 7));
            shapes.add(new Rectangle(100, 150, 10, 50));
            shapes.add(new Rectangle(21, 3, 17, 4));
            write(shapes);
        } else {
            final List<Shape> list = read();
            Collections.sort(list);
            System.out.println(list);
        }
        input.close();
    }

    private static void write(List<Shape> shapes) throws FileNotFoundException {
        final PrintWriter writer = new PrintWriter(file);
        for (Shape shape : shapes) {
            writer.println(shape);
        }
        writer.close();
    }

    private static List<Shape> read() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        final List<Shape> shapes = new ArrayList<Shape>();  
        while(reader.hasNext()) {
            shapes.add(Shape.fromString(reader.nextLine()));
        }
        reader.close();
        return shapes;
    }
}
