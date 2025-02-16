//package student;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//
//    static final String URL = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
//    static final String USER = "orclpdbuser";
//    static final String PASSWORD = "isdb62";
//
//    public static void main(String[] args) {
//
//
//        Student student = new Student(1, "Ashik", 1, 30, "Nahid", 3.00);
//        Student student1 = new Student(2, "Himu", 10, 26, "Omor", 3.22);
//        Student student2 = new Student(3, "Foysal", 12, 31, "Ikram", 2.00);
//        Student student3 = new Student(4, "Hemal", 14, 32, "Jahid", 2.50);
//        Student student4 = new Student(5, "Jakaria", 15, 34, "Hasan", null);
//
//        List<Student> students = new ArrayList<>();
//        students.add(student);
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//
//        for(Student st : students){
//            insertStudentData(st);
//        }
//
//
////        List<Student> fetchStudentData = new ArrayList<>();
////        for(Student stu : students){
////            fetchStudentData(stu);
////        }
//        fetchData();
//
//    }
//
//    public static void insertStudentData(Student st){
//        String sql = "INSERT INTO student_data(id, name, class, age, classTeacher, mark) VALUES(?,?,?,?,?,?)";
//
//        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
//
//            preparedStatement.setInt(1,st.getId());
//            preparedStatement.setString(2, st.getName());
//            preparedStatement.setInt(3,st.getClassName());
//            preparedStatement.setInt(4,st.getAge());
//            preparedStatement.setString(5,st.getClassTeacher());
//            //preparedStatement.setDouble(6,st.getMark());
//            if(st.getMark() !=null){
//                preparedStatement.setDouble(6, st.getMark());
//            }else{
//                preparedStatement.setNull(6, Types.DOUBLE);
//            }
//
//            preparedStatement.executeUpdate();
//        }catch (SQLException e){
//            System.out.println(e. getMessage());
//        }
//    }
//    public static void fetchData(){
//
//        String sqls = "SELECT * FROM student_data";
//        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//             Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery(sqls)){
//
//            while (resultSet.next())
//        }
//
//    }
//}
