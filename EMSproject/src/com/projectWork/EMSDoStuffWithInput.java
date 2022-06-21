package com.projectWork;

import java.util.Map;

import com.projectWork.exceptions.UniqueIDsOnlyException;

public class EMSDoStuffWithInput {

	// TODO how do i make these all seperate classes
	public static Map<Integer, Employee> doStuff(int input, Map<Integer, Employee> employeeList) {
		// add
		if (input == 1) {
			System.out.println("Selected \"add\"");
			System.out.println("Please input the correct fields for new Employee");
			Employee employeeUser;
			// int id, int salary, String date, String firstName, String lastName, String
			// department

			// enter int 0 to go back to options
			// check for wrong inputs
			
			// maybe loop to let user try again?
			System.out.println("Please enter new id number");

			try { // getting intputs
				
				// check for unique id. same id not allowed in this
				int inId = EMSConsole.scan.nextInt(); 
				if(employeeList.containsKey(inId)) {
					throw new UniqueIDsOnlyException();
				}
				// TODO make sure to get only the numbers,
				System.out.println("Enter employee's salary(Numbers only)");
				int inSalary = EMSConsole.scan.nextInt();
				
				// TODO check correct format and no other strange inputs, and no end line
				System.out.println("Enter Date employee joined(mm/dd/yy):");
				EMSConsole.scan.nextLine(); // clears line i think, the last line has a left over input from pressing enter
				String inDate = EMSConsole.scan.nextLine();
				
				System.out.println("Enter Employee's First Name:");
				String inFirstName = EMSConsole.scan.nextLine();
				
				System.out.println("Enter Employee's Last Name:");
				String inLastName = EMSConsole.scan.nextLine();
				
				System.out.println("Enter Employee's Department:");
				String inDepartment = EMSConsole.scan.nextLine();
				
				employeeUser = new Employee(inId, inSalary, inDate, inFirstName, inLastName, inDepartment);
				employeeList.put(inId, employeeUser); // we added employee to a map given
				

			} catch (UniqueIDsOnlyException e) {
				System.out.println(e.getMessage());
			}

		}
		// update
		else if (input == 2) {
			System.out.println("Selected \"update\"");
			System.out.println("Enter the ID of employee you want to update.");
			
			int updateID = EMSConsole.scan.nextInt();
			EMSConsole.scan.nextLine(); // CLEAR another int leaves the next line TODO CHECK FOR THIS
			if(employeeList.containsKey(updateID)) {
				System.out.println("UPDATING EMPLOYEE "+ updateID);
				System.out.println("Update salary? Y/N");
				if(EMSConsole.scan.nextLine().compareToIgnoreCase("y")==0) {//y yes
					// TODO
					System.out.println("TODO");
				}
				System.out.println("Update Date? Y/N");
				if(EMSConsole.scan.nextLine().compareToIgnoreCase("y")==0) {
					// TODO
					System.out.println("TODO");
				}
				System.out.println("Update Name? Y/N");
				if(EMSConsole.scan.nextLine().compareToIgnoreCase("y")==0) {
					// TODO
					System.out.println("TODO");
				}
				// TODO Department
			} else {
				System.out.println("ID does not exist");
			}
			
		}
		// remove

		else if (input == 3) {
			System.out.println("Selected \"remove\"");
			System.out.println("Enter the ID of employee you want to remove.");
			
			int removeID = EMSConsole.scan.nextInt();
			if(employeeList.containsKey(removeID)) {
				System.out.println("REMOVING EMPLOYEE "+ removeID);
				employeeList.remove(removeID);
			}
			
			System.out.println("done");
		}
		// list info
		else if (input == 4) {
			System.out.println("List: " + employeeList.toString());
			//TODO 1 EMPLOYEE
		}

		return employeeList;// return changes
		// leave
	}

}
