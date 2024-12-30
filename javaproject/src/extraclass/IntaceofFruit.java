package extraclass;

public class IntaceofFruit {

    public static class InstanceOfFruit {
        public static void main(String[] args) {
            Fruit[] fruits = {
                    new IntaceofFruit().new Fruit(),
                    new IntaceofFruit().new Orange(),
                    new IntaceofFruit().new Apple(),
                    new IntaceofFruit().new GoldenDelicious(),
                    new IntaceofFruit().new McIntosh()
            };

            for (Fruit fruit : fruits) {
                checkType(fruit);
            }
        }

        private static void checkType(Fruit fruit) {
            System.out.println(fruit.getClass().getSimpleName() + " instanceof Fruit? " + (fruit instanceof Fruit));
            System.out.println(fruit.getClass().getSimpleName() + " instanceof Orange? " + (fruit instanceof Orange));
            System.out.println(fruit.getClass().getSimpleName() + " instanceof Apple? " + (fruit instanceof Apple));
            System.out.println(fruit.getClass().getSimpleName() + " instanceof GoldenDelicious? " + (fruit instanceof GoldenDelicious));
            System.out.println(fruit.getClass().getSimpleName() + " instanceof McIntosh? " + (fruit instanceof McIntosh));
            System.out.println();
        }
    }
    class Fruit {}

    class Apple extends Fruit {}

    class Orange extends Fruit {}

    class GoldenDelicious extends Apple {}

    class McIntosh extends Apple {}
}
