package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BestQuantityTest {

    @Test
    public void oneMileIsTheBestQuantity() {
        var oneInch = new UnitComparator(1,Units.INCH);
        var oneFoot = new UnitComparator(1,Units.FOOT);
        var oneYard = new UnitComparator(1,Units.YARD);
        var oneMile = new UnitComparator(1,Units.MILE);

        assertEquals(oneMile, new BestQuantity(oneInch, oneFoot, oneYard, oneMile).bestQuantity());
    }

    @Test
    public void oneYardIsNotTheBestQuantity() {
        var oneInch = new UnitComparator(1,Units.INCH);
        var oneFoot = new UnitComparator(1,Units.FOOT);
        var oneYard = new UnitComparator(1,Units.YARD);
        var oneMile = new UnitComparator(1,Units.MILE);

        assertNotEquals(oneYard, new BestQuantity(oneInch, oneFoot, oneYard, oneMile).bestQuantity());
    }

    @Test(expected = RuntimeException.class)
    public void differentTypesOfMeasurementCanNotBeCompared() {
        var oneInch = new UnitComparator(1,Units.INCH);
        var oneFoot = new UnitComparator(1,Units.FOOT);
        var oneCup = new UnitComparator(1,Units.CUP);
        var oneMile = new UnitComparator(1,Units.MILE);

        assertEquals(oneMile, new BestQuantity(oneInch, oneFoot, oneCup, oneMile).bestQuantity());
    }

}
