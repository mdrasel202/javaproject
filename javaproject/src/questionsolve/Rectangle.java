package questionsolve;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) throws NegativeNumberException{
        if(width < 0 || height < 0){
            throw new NegativeNumberException("Width and Height cannot be negative");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width*height;
    }

//    @Override
//    public void validateDimensions() throws NegativeNumberException {
//        if(width < 0 || height < 0){
//            throw new NegativeNumberException("Width and Height cannot be negative ");
//        }
//    }
}
