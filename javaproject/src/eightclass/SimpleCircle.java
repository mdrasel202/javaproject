package eightclass;

public class SimpleCircle {
    public static void main(String[] args) {

        SimpleCircle circle = new SimpleCircle();
        System.out.println("The area of the circle with radius " + circle.radius + " is " + circle.getArea());

        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle with radius " + circle2.radius + " is " + circle2.getArea());

        // Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle with radius " + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle with radius " + circle2.radius + " is " + circle2.getArea());

        circle2.getPerimeter();
        System.out.println(circle2.getPerimeter());
    }

    double radius;

    // Default constructor, sets radius to 1
    SimpleCircle() {
        radius = 1;
    }

    // Constructor with parameter to initialize radius
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    // Method to calculate the area of the circle
    double getArea() {
        return radius * radius * Math.PI;
    }

    // Method to calculate the perimeter of the circle
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Setter method to change the radius
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
