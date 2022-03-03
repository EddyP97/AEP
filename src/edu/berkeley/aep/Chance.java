package edu.berkeley.aep;

//Understands what the possibility of an event happening
public class Chance {

    private final double probability;

    public Chance(double probability) {
        this.probability = probability;

    }

    public Chance not() {
        return new Chance(1- probability);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Chance)) return false;
        return Double.compare(((Chance) other).probability, probability) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(probability);
    }


}
