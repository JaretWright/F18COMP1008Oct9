package f18comp1008oct9;

import java.util.ArrayList;

/**
 *
 * @author jwright
 */
public class Test1Version1 {
    public static void main(String[] args)
    {
        //instantiate new Rectangle objects
        Rectangle rect1 = new Rectangle(10,30);
        Rectangle rect2 = new Rectangle(23,23);
        Rectangle rect3 = new Rectangle(23.2,99.45);
        
        //Create an ArrayList of Rectangle objects
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rect1);
        rectangles.add(rect2);
        rectangles.add(rect3);
        
        //call the method displayRectangleAttributes and pass in the ArrayList
        //of Rectangle objects
        displayRectangleAttributes(rectangles);
    }
    
    public static void displayRectangleAttributes(ArrayList<Rectangle> shapes)
    {
        for (int i=0; i<shapes.size(); i++)
        {
            Rectangle r = shapes.get(i);
            
            System.out.printf("Rectangle %d: dimensions: %s area: %.1f"
                    + " perimeter: %.1f square: %b%n", i+1, r.toString(),
                                     r.getArea(), r.getPerimeter(), r.isSquare());
        }
    }
            
}
