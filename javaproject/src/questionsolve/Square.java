package questionsolve;

public class Square extends Rectangle{

    public Square(double side) throws NegativeNumberException {
        super(side, side);
        if (side < 0) {
            throw new NegativeNumberException("Side length cannot be negative.");
        }
    }
}
