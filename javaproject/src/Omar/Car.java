package Omar;

public class Car extends Vehicle {
    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("speed up from");
    }
}
