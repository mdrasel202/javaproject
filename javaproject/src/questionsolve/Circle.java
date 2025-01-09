package questionsolve;

public class Circle extends Shape{
    private final double radius;

    public Circle(double radius)throws NegativeNumberException {
        if(radius < 0 ){
            throw new NegativeNumberException("Radius cannot be negative");
        }
        this.radius = radius;
    }



    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }

//    @Override
//    public void validateDimensions() throws NegativeNumberException{
//        if(radius < 0){
//            throw new NegativeNumberException("Radius cannot be negative");
//        }
//    }
}
