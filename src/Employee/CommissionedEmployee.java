package Employee;

public class CommissionedEmployee extends Employee{

    private double sales;
    double commissionRate;

    public double getSales() {
        return sales;
    }
    public void setSales(double sales) {
        this.sales = sales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public CommissionedEmployee(int id, String n, double t, double s, double cr) {
        super(id,n,t);
        this.setSales(s);
        this.setCommissionRate(cr);
    }
    public double calculateSalary() {
        double gross, tax, Salary;
        gross = this.getSales() * this.getCommissionRate();
        tax = gross * this.getTaxRate();
        Salary = gross - tax;
        return Salary;
    }
    public String toString() {
        String x;
        String s=Double.toString(this.getSales());
        String cr =Double.toString(this.getCommissionRate());
        x = super.toString()+" "+s+" "+cr;
        return x;
    }
}