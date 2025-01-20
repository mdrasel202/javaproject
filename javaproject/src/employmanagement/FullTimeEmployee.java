package employmanagement;

public class FullTimeEmployee extends Employee implements TaxCalculator{


    FullTimeEmployee(String name, int ID, double salary) {
        super(name, ID, salary);
    }

    @Override
    public void displayinformation() {
        System.out.println("Name\t"+name+ "\tID\t"+ID+"\tSalary"+salary);
    }

    @Override
    public double calculatortaxes() {

        return salary;
    }

}
