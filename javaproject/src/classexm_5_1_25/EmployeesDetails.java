package classexm_5_1_25;
import java.time.LocalDate;
import java.util.Date;

public class EmployeesDetails {
    private String name;
    private double salary;
    private LocalDate yearOfJoinig;
    private String address;

    public EmployeesDetails(String name, double salary, LocalDate year_of_joinig, String address){
        this.name=name;
        this.salary=salary;
        this.yearOfJoinig=year_of_joinig;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getYear_of_joinig() {
        return yearOfJoinig;
    }

    public void setYear_of_joinig(LocalDate year_of_joinig) {
        this.yearOfJoinig = year_of_joinig;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayinformation(){
        System.out.print(name+"\t");
        System.out.print(yearOfJoinig +"\t\t\t");
        System.out.print(address);
        System.out.println();
    }
}
