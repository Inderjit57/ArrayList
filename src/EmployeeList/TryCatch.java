package EmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TryCatch {
	
	public static void main(String[] args) {
		List<Integer> employeeId = new ArrayList<Integer>();
		
		employeeId.add(20);
		employeeId.add(56);
		employeeId.add(78);
		employeeId.add(18);
		employeeId.add(9);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an index value");
		int id = sc.nextInt();
		
		//Exeption will occur and program will be terminated if out of limit index is used to execute the statement
		//System.out.println(employeeId.get(id));
		
		/*
		 * Use of Try and Catch block to handle exception errors
		 * it simply means if an exception occurs, 
		 * try to catch it and print a statment instead of printing exception statements
		 */
		
		try {
			System.out.println(employeeId.get(id));
		} catch(Exception exception) {
			System.out.println("Index value is not in the list");
			
			//Optional to printStackTrace, which will print exception statements during runtime
			exception.printStackTrace();
		}
		//Finally is a block to close database connections after the programs are ended
		//optional to choose after try block
		finally {
			sc.close();
		}
		// if any code is written outside the tryCatch block and if it has an exception occurs
		// compiler will keep running the code and terminate at this point
		System.out.println(employeeId.get(id));
		
		/*
		 * other Excpetions:
		 *  NullPointException
		 *  FileNotFoundException - occurs when file is not found in the system.
		 */
		
		
		
	}

}
