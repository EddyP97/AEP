package edu.berkeley.aep;

//Understands different type of measurement
public enum Units {

    INCH(1, UnitType.LENGTH),
    FOOT(12, UnitType.LENGTH),
    YARD(FOOT.value*3, UnitType.LENGTH),
    MILE(YARD.value*1760, UnitType.LENGTH),


    TEASPOON(1, UnitType.VOLUME),
    TABLESPOON(TEASPOON.value*3, UnitType.VOLUME),
    OUNCE(TABLESPOON.value*2, UnitType.VOLUME),
    CUP(OUNCE.value*8, UnitType.VOLUME),

    FAHRENHEIT(1, UnitType.TEMPERATURE),
    CELSIUS(1, UnitType.TEMPERATURE);


    private final int value;
    private final UnitType unitType;



    public enum UnitType {
        LENGTH, VOLUME, TEMPERATURE;
    }

    Units(int value, UnitType unitType) {
        this.value = value;
        this.unitType = unitType;
    }


    public int calculate(int value) {
        if (this == CELSIUS) {
            return ((value*9)/5)+32;
        }
        return this.value*value;
    }

    public boolean checkTypeForAddition(Units other) {
        if (unitType == UnitType.TEMPERATURE) {
            return false;
        }
        return unitType == other.unitType;
    }

    public boolean checkTypeSame(Units unit) {
        return unitType == unit.unitType;
    }

}
