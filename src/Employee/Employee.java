package Employee;

public class Employee {
    private int empId;
    private String Name;
    private double taxRate;

    public Employee() {
        this.setEmpId(0);
        this.setName("");
        this.setTaxRate(0.0);
    }
    public Employee(int id, String n, double t) {
        this.setEmpId(id);
        this.setName(n);
        this.setTaxRate(t);
    }
    public double calculateSalary() {

        return 0.0;
    }

    public String toString() {
        return this.getEmpId()+ " " +this.getName()+" "+this.getTaxRate();
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getTaxRate() {
        return taxRate;
    }
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }


}