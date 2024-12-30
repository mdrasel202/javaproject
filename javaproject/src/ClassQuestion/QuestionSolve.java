package ClassQuestion;

public class QuestionSolve {
    public static void main(String[] args) {
        int[] number = new int[]{20,50,90,40,80};
        int sum = 0;

        for(int i=0; i<number.length; i++){
            sum += number[i];
        }
        double average = sum/number.length;
        System.out.println("Calculate the average valur : "+average);
    }
}
