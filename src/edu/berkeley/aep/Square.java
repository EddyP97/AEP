package edu.berkeley.aep;

//Understands a shape with four sides with same length and right angles
public class Square extends Rectangle{

/*    private final int sides;*/

    public Square(int side) {
        super(side,side);
    }

/*    public Square(int side) {
        this.sides = side;
    }*/

    @Override
    public boolean equals(Object o){
        return false;
    }

}
