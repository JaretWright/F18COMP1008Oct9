package f18comp1008oct9;

/**
 *
 * @author jwright
 */
public class Rectangle {
    
    //define instance variables 
    private double length, width;
    
    /**
     * This is a Javadoc comment that defines where the constructor is.
     * Constructors must have the same name as the class
     * Constructors do not have a return type defined
     */
    public Rectangle(double length, double width)
    {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    /**
     * This method will ensure that the length is greater than 0
     * and set the instance variable accordingly
     * @param double length 
     */
    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            throw new IllegalArgumentException("Length must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    /**
     * This method validates that the width is greater than 0 and sets the
     * instance variable accordingly
     * @param width 
     */
    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("Width must be greater than 0");
    }
    
    /**
     * The getArea method will return the area of the Rectangle
     */
    public double getArea()
    {
        return length*width;
    }
    
    /**
     * The getPerimeter method will return the perimeter of the Rectangle
     * The formula used is the sum of all sides
     */
    public double getPerimeter()
    {
        return length+length+width+width;
    }
    
    /**
     * This returns true if the length is equal to the width
     */
    public boolean isSquare()
    {
        return length==width;
    }
    
    /**
     * This method will return a String with the format of [length] x [width]
     */
    public String toString()
    {
        return length + " x " + width;
    }
    
    
    
    
    
}
