package edu.berkeley.aep;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquareTest {

    @Test
    public void squareWithSidesTwoShouldNotBeTheSameAsAnotherSquareWithSidesThree() {
        var twoSidedSquare = new Square(2);
        var anotherTwoSidedSquare = new Square(3);
        assertNotEquals(twoSidedSquare,anotherTwoSidedSquare);
    }

    @Test
    public void squareWithSidesTwoShouldBeTheSameAsAnotherSquareWithSidesTwo() {
        var twoSidedSquare = new Square(2);
        var anotherTwoSidedSquare = new Square(2);
        assertEquals(twoSidedSquare,anotherTwoSidedSquare);
    }

    @Test
    public void squareWithSidesTwoShouldHaveSameAreaAsAnotherSquareWithSidesTwo() {
        var twoSidedSquare = new Square(2);
        var anotherTwoSidedSquare = new Square(2);

    }

}
