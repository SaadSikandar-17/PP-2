package Employee;

public class HourlyEmployee extends Employee{

    private double hours;
    private double hourlyRate;
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public HourlyEmployee(int id, String n, double t, double h, double hr) {
        super(id,n,t);
        this.setHours(h);
        this.setHourlyRate(hr);
    }

    public double calculateSalary() {
        double gross, tax, Salary;

        gross= this.getHours() * this.getHourlyRate();
        tax= gross * this.getTaxRate();
        Salary= gross - tax;
        return Salary;
    }

    public String toString() {
        String x;
        String h=Double.toString(this.getHours());
        String hr =Double.toString(this.getHourlyRate());
        x= super.toString()+" "+h+" "+hr;
        return x;
    }
}
