package employmanagement;

public class PartTimeEmployee extends Employee implements TaxCalculator{

    double tax = 0.01;

    PartTimeEmployee(String name, int ID, double salary) {
        super(name, ID, salary);
        this.tax = tax;
    }

    @Override
    public double calculatortaxes() {
        return salary*tax;
    }

    @Override
    public void displayinformation() {
        System.out.println("Name\t"+name+ "\tID\t"+ID+"\tSalary "+salary+"\tTaxes\t"+calculatortaxes());
    }
}
