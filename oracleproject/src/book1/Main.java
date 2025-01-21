package book1;

import book.InsertBookData;

public class Main {
    public static void main(String[] args) {
        SelectStudentOracle selectStudentOracle = new SelectStudentOracle();
        selectStudentOracle.selectAllStudent();

        StudentUpdate input = new StudentUpdate();
        input.upadate();

        SelectStudentOracle selectStudentOracle2 = new SelectStudentOracle();
        selectStudentOracle2.selectAllStudent();
        }
    }
