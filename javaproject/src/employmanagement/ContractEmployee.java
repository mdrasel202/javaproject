package employmanagement;

public class ContractEmployee extends Employee implements TaxCalculator{

    double contract = 100000;

    ContractEmployee(String name, int ID, double salary) {
        super(name, ID, salary);
        this.contract = contract;
    }

    @Override
    public void displayinformation() {
        System.out.println("Name\t"+name+ "\tID\t"+ID+"Salary\t"+salary+"\tContract\t"+calculatortaxes());
    }

    @Override
    public double calculatortaxes() {
        return contract;
    }
}
