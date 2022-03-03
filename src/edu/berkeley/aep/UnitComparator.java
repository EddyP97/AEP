package edu.berkeley.aep;


//Understands different types of measurement with same value

public class UnitComparator {
    private final int value;
    private final Units unit;

    public UnitComparator(int value, Units unit) {
        this.value = value;
        this.unit = unit;
    }

    private int calculateValue() {
        return unit.calculate(value);
    }


    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof UnitComparator)) return false;
        if (!unit.checkTypeSame(((UnitComparator) other).unit)) {
            return false;
        }
        return Double.compare(calculateValue(), ((UnitComparator) other).calculateValue()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


    public UnitComparator add(UnitComparator anotherUnit) {
        if (!unit.checkTypeForAddition(anotherUnit.unit)) {
            throw new RuntimeException();
        }
        return switch (unit) {
            case INCH, FOOT, YARD, MILE ->
                    new UnitComparator( (calculateValue() + anotherUnit.calculateValue()), Units.INCH);
            case TEASPOON, TABLESPOON, OUNCE, CUP ->
                    new UnitComparator(calculateValue() + anotherUnit.calculateValue(), Units.TEASPOON);
            default ->
                    throw new IllegalStateException("Unexpected value: " + unit);
        };
    }

    public boolean betterThan(UnitComparator other) {
        if (!unit.checkTypeSame(other.unit)) {
            throw new RuntimeException();
        }
        return calculateValue() > other.calculateValue();
    }
}