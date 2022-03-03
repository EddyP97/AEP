package edu.berkeley.aep;

import java.util.HashMap;
import java.util.Map;

//Understands a shape with four sides and right angles
public class Rectangle {
    private final int height;
    private final int width;
    private static Map<Integer, Rectangle> myRectangels = new HashMap<>();

    public static Rectangle createSquare(int side) {
/*        if (!myRectangels.containsKey(side)) {
            myRectangels.put(side, new Rectangle(side, side));
        }
        return myRectangels.get(side);*/
        return new Rectangle(side, side);
    }

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getPerimeter() {
        return width*2+height*2;
    }

    public int getArea() {
        return width*height;
    }
}
