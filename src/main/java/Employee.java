public class Employee {
    private int employeeId;
    private String employeeName;
    private double hoursWorked;
    private double payRate;

    public Employee(int emplyeeId, String employeeName,double hoursWorked, double payRate){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getPayRate() {
        return payRate;
    }
    public double getgrosspay(){
        return hoursWorked * payRate;



    }
}

