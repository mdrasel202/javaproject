public class Main {
    public static void main(String[] args) {
        String[][] students={
                {"John Done", "20", "john.done@example.com"},
                {"Jane Smith", "22", "jane.smith@example.com"},
                {"Alice Johnson", "19", "alice.johnson@example.com"},
                {"Bob Brown", "21", "bob.brown@example.com"}
        };

        InsetStudentData oracle = new InsetStudentData();
        oracle.insertDummyData(students);
    }
}