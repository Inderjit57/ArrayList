package EmployeeList;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeVerification accountA = new EmployeeVerification("Superman", 111, 5000);
		EmployeeVerification accountB = new EmployeeVerification("Batman", 222, 9000);
		EmployeeVerification accountC = new EmployeeVerification("Flash", 333, 3000);
		EmployeeVerification accountD = new EmployeeVerification("Scoobydoo", 444, 10000);

		// creating arraylist to add more objects
		ArrayList<EmployeeVerification> arraylist = new ArrayList<EmployeeVerification>();
		arraylist.add(accountA);
		arraylist.add(accountB);
		arraylist.add(accountC);
		arraylist.add(accountD);

		// size of an ARRAYLIST
		System.out.println("Total employee in a list: " + arraylist.size());

		// accessing the variables using the index of an object from the arraylist
		System.out.println("Employee name: " + arraylist.get(arraylist.indexOf(accountA)).getEmployeeName() + " \nID: "
				+ arraylist.get(arraylist.indexOf(accountA)).getEmployeeID() + " \nMonthly salary: "
				+ arraylist.get(arraylist.indexOf(accountA)).getMonthlySalary());
		System.out.println("Employee name: " + arraylist.get(arraylist.indexOf(accountB)).getEmployeeName() + " \nID: "
				+ arraylist.get(arraylist.indexOf(accountB)).getEmployeeID() + " \nMonthly salary: "
				+ arraylist.get(arraylist.indexOf(accountB)).getMonthlySalary());
		System.out.println("Employee name: " + arraylist.get(arraylist.indexOf(accountC)).getEmployeeName() + " \nID: "
				+ arraylist.get(arraylist.indexOf(accountC)).getEmployeeID() + " \nMonthly salary: "
				+ arraylist.get(arraylist.indexOf(accountC)).getMonthlySalary());

		// removing object from arraylist
		System.out.println("Remove employee from the list: " + arraylist.remove(arraylist.indexOf(accountD)));
		System.out.println("New employee list: " + arraylist.size());

		// Add object in the arraylist
		EmployeeVerification accountE = new EmployeeVerification("Fishman", 0001, 60000);
		arraylist.add(1, accountE);

		System.out.println("New employee list: " + arraylist.toString());

	}

}
