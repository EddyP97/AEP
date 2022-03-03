package edu.berkeley.aep;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void allSidesAreTwoThePerimeterIsEight() {
        var rectangle = new Rectangle(2,2);
        assertEquals(8,rectangle.getPerimeter());
    }

    @Test
    public void widthIsFourAndLengthIsTwoThePerimeterIsTwelve() {
        var rectangle = new Rectangle(4,2);
        assertEquals(12,rectangle.getPerimeter());
    }

    @Test
    public void allSidesAreTwoTheAreaIsFour() {
        var rectangle = new Rectangle(2,2);
        assertEquals(4,rectangle.getArea());
    }

    @Test
    public void widthIsFourAndLengthIsTwoTheAreaIsEight() {
        var rectangle = new Rectangle(4,2);
        assertEquals(8,rectangle.getArea());
    }

    @Test
    public void squareWithSideTwoShouldHaveAreaFour() {
        var square = Rectangle.createSquare(2);
        assertEquals(4, square.getArea());
    }

}
