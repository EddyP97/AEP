package edu.berkeley.aep;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ChanceTest {
    @Test
    public void checkProbabilityForDiceAndCoinNotTheSame() {
        var chanceCoin = new Chance(1d/2d);
        var chanceDie = new Chance(1d/6d);
        assertFalse(chanceDie.equals(chanceCoin));
    }

    @Test
    public void notOfProbabilityOneSixthShouldBeFiveSixths() {
        var dieRoll = new Chance(1d/6d);
        var dieRollComplement = new Chance(5d/6d);
        assertEquals(dieRollComplement, dieRoll.not());
    }


    @Test
    public void valueObjectShouldOverrideHashcode() {
        var coinToss = new Chance(1d/2d);
        var coinTosses = new HashMap<Chance, String>();
        coinTosses.put(coinToss, "Heads!");
        assertEquals("Heads!", coinTosses.get(new Chance(1d/2d)));
    }


    //
    //write an implementation for not() - the probability of an event not occurring.
}
