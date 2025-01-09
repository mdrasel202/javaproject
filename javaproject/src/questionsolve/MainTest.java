package questionsolve;

public class MainTest {
    public static void main(String[] args) {

        try {
//            Circle circle = new Circle(5);
//            Rectangle rectangle = new Rectangle(20, 10);

            Shape circle = new Circle(5);
            Shape rectangle = new Rectangle(-10, 4);
            Shape square = new Square(6);

            circle.calculateArea();
            System.out.println("Circle area : " + circle.calculateArea());

            System.out.println();

            rectangle.calculateArea();
            System.out.println("Rectangle width and height :" + rectangle.calculateArea());

            System.out.println();
            
            square.calculateArea();
            System.out.println("Square"+square.calculateArea());

        }catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
