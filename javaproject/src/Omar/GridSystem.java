package Omar;

public class GridSystem {
    public static void main(String[] args) {

        String linetype = "-";
        int charNumber = 60;

        for (int i = 1; i <= 60; i++) {
            if (i % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(linetype);
            }
        }
    }
}
