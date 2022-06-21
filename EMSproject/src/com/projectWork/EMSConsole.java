package com.projectWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EMSConsole {
	
	public static Scanner scan;

	public static void emsConsole() {
		int input = 0;

		// make list of employees key, value map(make key id)
		Map<Integer, Employee> employees = new HashMap<Integer, Employee>();

		// making default item on map
		Employee employee = new Employee();
		employees.put(employee.getId(), employee); // put on map
		// TODO test this map

		
		
		// TODO make sure have everything with scanner ???
		try  {
			scan = new Scanner(System.in);
			
			// start welcome
			System.out.println("Welcome to our new Employee management system!");

			// print options, do options, repeat
			do {
				System.out.println("\nPress and enter a number to choose an option");
				// choices: add employee, update, remove, list emplyee info,
				System.out.println("\n1. add   2. update   3. remove   4. info   0. EXIT");

				// read input
				input = scan.nextInt(); // note for research: radix
				
				
				employees = EMSDoStuffWithInput.doStuff(input, employees);
				
				
				
			
				
				

			} while (input != 0); // stop and end loop
		} // end try
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			scan.close();
		}// close scanner
		System.out.println("PROGRAM IS CLOSED");
	}// method end

}// end
