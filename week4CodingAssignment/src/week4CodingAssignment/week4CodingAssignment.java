package week4CodingAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class week4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.)creat an instance of an ArrayList of String called employeeNames.
		
		List<String> employeeNames = new ArrayList<String>();
		
		
		//System.out.println(employeeNames[0]);

		
		//2.) create an instance of a HashSt of Integer called ID
		
		Set<Integer> ids = new HashSet<Integer>(); 
		
		//3. create an instance of a HashMap of Integer, String called employeeMap
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>(); 
		
		//4.) Add at least five entrie to the employeeNames and ids (Make sure both collection have the same number of entries
		
		employeeNames.add("employee1");
		employeeNames.add("employee2");
		employeeNames.add("employee3");
		employeeNames.add("employee4");
		employeeNames.add("employee4");
		
		for (int i = 1; i <= employeeNames.size(); i++) {
			ids.add(i);
		}
		
		//5.) Create a variable int i = 0 then iterate over ids using the enhanced for.  Inside the enchached for lopp use employeeMp.put() to add a new entry to the Map.class  The entry should consist of a key that is the id in the enhance loops current iteration and a value tha ti sthe employeeName at position i of the employeeNames ArrayList.  Increment i so thtat each iteration grabs the next element in the ArrayList		
	
		int i = 0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		
		//6.)  Once the employeeMap is fully populated, use another enhance for loop to iterate over the employeeMap.keySet() and use the key for each current iteration to print to the console both the current key and its accoiated vaue in the map
		
		
		for (Integer key : employeeMap.keySet()) {
			System.out.printf("employee %d is %s.%n", key, employeeMap.get(key));
		}
		
		//.7) create a StringBuilder called idsBuilder
		
		StringBuilder idsBuilder = new StringBuilder();
		
		//.8)  Iterate over the ids HashSet and append each id, followed by a dash "-" to idsBuilder
		
		for (Integer id : ids) {
			idsBuilder.append(id + "-");
		}
		
		//9.) Print the results of idsBuilder.toString() to the console
		
		System.out.println(idsBuilder.toString());
		
		//10.)
		
		StringBuilder namesBuilder = new StringBuilder();
		
		//11.)  Iterate over the emplNames ArrayList and append each name followed by a space " " to the nameBuilder
		
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		
		//12.) print the results of namesBuilder.toSTring() to the console
		
		System.out.println(namesBuilder.toString()); 

		

	
	
	
	
	}//end of main method
	
}//end of class
