//package HomeWork;
//
//import java.util.Scanner;
//
//public class isdbExamEvaluation {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Collecting inputs for mid-monthly and monthly marks
//        int midMonMcq = getMarks(input, "mid-monthly mcq");
//        int midMonEvi = getMarks(input, "mid-monthly evidence");
//        int monMcq = getMarks(input, "monthly mcq");
//        int monEvi = getMarks(input, "monthly evidence");
//
//        // Calculate weighted scores
//        double mcqTotal = calculateScore(midMonMcq, 20) + calculateScore(monMcq, 80);
//        double eviTotal = calculateScore(midMonEvi, 20) + calculateScore(monEvi, 80);
//
//        // Calculate the grand total score
//        double grandTotal = mcqTotal + eviTotal;
//
//        // Determine pass/fail status
//        String status = (mcqTotal >= 30 && eviTotal >= 30) ? "Passed!" : "Failed!";
//
//        // Output the results
//        displayResults(midMonMcq, midMonEvi, monMcq, monEvi, mcqTotal, eviTotal, grandTotal, status);
//    }
//
//    // Method to get marks from user
//    private static int getMarks(Scanner input, String type) {
//        System.out.print("Enter " + type + " marks: ");
//        return input.nextInt();
//    }
//
//    // Method to calculate weighted score for mcq/evidence
//    private static double calculateScore(int marks, int weight) {
//        return marks * ((double) weight / 100);
//    }
//
//    // Method to display the results
//    private static void displayResults(int midMonMcq, int midMonEvi, int monMcq, int monEvi, double mcqTotal, double eviTotal, double grandTotal, String status) {
//        System.out.println("==================================================");
//        System.out.println("mid-monthly marks: " + midMonMcq + "(mcq)" + " " + midMonEvi + "(evidence)");
//        System.out.println("monthly marks: " + monMcq + "(mcq)" + " " + monEvi + "(evidence)");
//        System.out.println("==================================================");
//        System.out.println("final score: "
//                + Math.round(mcqTotal)
//                + "(" + Math.round(midMonMcq * 0.20) + "+" + Math.round(monMcq * 0.80) + ")" + "(mcq)" + " + "
//                + Math.round(eviTotal)
//                + "(" + Math.round(midMonEvi * 0.20) + "+" + Math.round(monEvi * 0.80) + ")" + "(evidence) "
//                + "= " +
//    }
