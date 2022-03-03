package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitComparatorTest {

    @Test
    public void TwelveInchesDoNotEqualsTwoFeet() {
        var twelveInches = new UnitComparator(12, Units.INCH);
        var oneFoot = new UnitComparator(2, Units.FOOT);
        assertNotEquals(twelveInches, oneFoot);

    }

    @Test
    public void TwelveInchesEqualsTwelveInches() {
        var twelveInches = new UnitComparator(12, Units.INCH);
        var anotherTwelveInches = new UnitComparator(12, Units.INCH);
        assertTrue(twelveInches.equals(anotherTwelveInches));
    }

    @Test
    public void TwelveInchesDoesNotEqualsElevenInches() {
        var twelveInches = new UnitComparator(12, Units.INCH);
        var ElevenInches = new UnitComparator(11, Units.INCH);
        assertFalse(twelveInches.equals(ElevenInches));
    }

    @Test
    public void TwelveInchesEqualsOneFoot() {
        var twelveInches = new UnitComparator(12, Units.INCH);
        var oneFoot = new UnitComparator(1, Units.FOOT);
        assertEquals(twelveInches, oneFoot);
    }

    @Test
    public void ThreeFeetEqualsOneYard() {
        var threeFeet = new UnitComparator(3, Units.FOOT);
        var oneYard = new UnitComparator(1, Units.YARD);
        assertEquals(threeFeet,oneYard);
    }

    @Test
    public void OneThousandSevenHundredAndSixtyEqualsOneMile() {
        var oneThousandSevenHundredAndSixty = new UnitComparator(1760, Units.YARD);
        var oneMile = new UnitComparator(1, Units.MILE);
        assertEquals(oneThousandSevenHundredAndSixty,oneMile);
    }

    @Test
    public void oneTablespoonEqualsThreeTeaspoons() {
        var oneTablespoon = new UnitComparator(1, Units.TABLESPOON);
        var threeTeaspoons = new UnitComparator(3, Units.TEASPOON);
        assertEquals(oneTablespoon,threeTeaspoons);
    }

    @Test
    public void oneOnceEqualsTwoTablespoons() {
        var twoTablespoons = new UnitComparator(2, Units.TABLESPOON);
        var oneOnce = new UnitComparator(1, Units.OUNCE);
        assertEquals(twoTablespoons,oneOnce);
    }

    @Test
    public void oneOnceEqualsSixTeaspoons() {
        var sixTeaspoons = new UnitComparator(6, Units.TEASPOON);
        var oneOnce = new UnitComparator(1, Units.OUNCE);
        assertEquals(sixTeaspoons,oneOnce);
    }


    @Test
    public void EightOuncesEqualsOneCup() {
        var eightOunces = new UnitComparator(8, Units.OUNCE);
        var oneCup = new UnitComparator(1, Units.CUP);
        assertEquals(eightOunces,oneCup);
    }

    @Test
    public void OneInchDoesNotEqualOneTeaspoon() {
        var oneInch = new UnitComparator(1, Units.INCH);
        var oneTeaspoon = new UnitComparator(1, Units.TEASPOON);
        assertNotEquals(oneInch,oneTeaspoon);
    }

    @Test
    public void TwoInchesPlusTwoInchesEqualsFourInches() {
        var twoInches = new UnitComparator(2, Units.INCH);
        var anotherTwoInches = new UnitComparator(2, Units.INCH);
        var fourInches = new UnitComparator(4, Units.INCH);
        assertEquals(fourInches, twoInches.add(anotherTwoInches));
    }

    @Test
    public void TwoTablespoonsPlusOneOunceEqualsTwelveTeaspoons() {
        var twoTablespoons = new UnitComparator(2, Units.TABLESPOON);
        var oneOunce = new UnitComparator(1, Units.OUNCE);
        var twelveTeaspoons = new UnitComparator(12, Units.TEASPOON);
        assertEquals( twelveTeaspoons, twoTablespoons.add(oneOunce));
    }

    @Test(expected = RuntimeException.class)
    public void TwoFeetPlusOneOunceDoesNotAdd() {
        var twoFeet = new UnitComparator(2, Units.FOOT);
        var oneOunce = new UnitComparator(1, Units.OUNCE);
        var twelveTeaspoons = new UnitComparator(12, Units.TEASPOON);
        assertEquals(twelveTeaspoons, twoFeet.add(oneOunce));
    }

    @Test
    public void TwoHundredAndTwelveFahrenheitEqualsHundredCelsius() {
        var twoHundredAndTwelveFahrenheit = new UnitComparator(212, Units.FAHRENHEIT);
        var hundredCelsius = new UnitComparator(100, Units.CELSIUS);
        assertEquals(hundredCelsius, twoHundredAndTwelveFahrenheit);
    }

    @Test
    public void ThirtyTwoFahrenheitEqualsZeroCelsius() {
        var thirtyTwoFahrenheit = new UnitComparator(32, Units.FAHRENHEIT);
        var zeroCelsius = new UnitComparator(0, Units.CELSIUS);
        assertEquals(zeroCelsius, thirtyTwoFahrenheit);
    }

    @Test(expected = RuntimeException.class)
    public void CantAddTemperature() {
        var thirtyTwoFahrenheit = new UnitComparator(32, Units.FAHRENHEIT);
        var zeroCelsius = new UnitComparator(0, Units.CELSIUS);
        assertEquals(new UnitComparator(64, Units.FAHRENHEIT), thirtyTwoFahrenheit.add(zeroCelsius));
    }

    @Test
    public void TwoInchesIsBetterThanOneInch() {
        var oneInch = new UnitComparator(1, Units.INCH);
        var twoInches = new UnitComparator(2, Units.INCH);
        assertTrue(twoInches.betterThan(oneInch));
    }

    @Test(expected = RuntimeException.class)
    public void TwoInchesComparedToOneCup() {
        var oneCup = new UnitComparator(1, Units.CUP);
        var twoInches = new UnitComparator(2, Units.INCH);
        assertTrue(twoInches.betterThan(oneCup));
    }

    @Test
    public void TwoInchesIsNotBetterThanOneYard() {
        var oneYard = new UnitComparator(1, Units.YARD);
        var twoInches = new UnitComparator(2, Units.INCH);
        assertFalse(twoInches.betterThan(oneYard));
    }

}
