package Employee;

public class SalariedEmployee extends Employee {

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee(int id, String n, double t, double s) {
        super(id,n,t);
        this.setSalary(s);
    }

    public double calculateSalary () {
        double Salary;
        Salary= this.getSalary() - (this.getSalary() * this.getTaxRate());
        return Salary;
    }
    public String toString() {
        String x;
        x= super.toString()+ " "+this.getSalary();
        return x;
    }
}