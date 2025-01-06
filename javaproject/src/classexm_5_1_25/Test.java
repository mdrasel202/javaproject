package classexm_5_1_25;

import java.time.LocalDate;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        EmployeesDetails input = new EmployeesDetails("Rahul",5000, LocalDate.of(1994,11,15),"Tilak Nagar, NewDelhi");
        EmployeesDetails input1 = new EmployeesDetails("Raman",7000, LocalDate.of(2000,11,15),"Hari Nagar, New Delhi");
        EmployeesDetails input2 = new EmployeesDetails("Rohit",9000, LocalDate.of(1999,11,15),"Subash Nagar, New Delhi");

        System.out.println("Name \t"+"Year of Joining \t\t\t"+"Address");

        input.displayinformation();
        input1.displayinformation();
        input2.displayinformation();



    }
}
