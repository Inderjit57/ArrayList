package EmployeeList;

public class EmployeeVerification {

	private String employeeName;
	private int employeeID;
	private double monthlySalary;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public EmployeeVerification(String employeeName, int employeeID, double annualSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.monthlySalary = annualSalary;
	}

}
