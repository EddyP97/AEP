package edu.berkeley.aep;

import java.util.List;

// Understands the biggest value of a list of measurements
public class BestQuantity {
    private final List<Bestable> quantities;

    public BestQuantity(Bestable... list) {
        this.quantities = List.of(list);
//        this.list = Arrays.asList(list);
/*        if (this.list.contains(null)) {
            throw new NullPointerException("List should not contain null values");
        }*/
        if (this.quantities.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("List should not be empty");
        }
    }

    public Bestable bestQuantity() {
        var best = quantities.get(0);
        for (var challenger : quantities) {
            if (challenger.betterThan(best)) {
                best=challenger;
            }
        }
        return best;
    }

}
