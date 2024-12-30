package recurtion;

public class Fibonacci {
    public static void main(String[] args) {
        int sum = sum(50);
        System.out.println("Sum of first 50 Fibonacci numbers: " + sum);
    }

    public static int sum(int count) {
        int n = 0, n2 = 1, n3 = 0, sum = 0;

        for (int i = 0; i < count; i++) {
            sum += n;
            n3 = n + n2;
            n = n2;
            n2 = n3;
        }

        return sum;
    }
}

