package firstpjt.firstpjt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee(1, "sharanya", (long) 50000, 30));
		employee.add(new Employee(1, "Nikhil", (long) 510000, 34));
		employee.add(new Employee(1, "Dimple", (long) 502000, 32));
		employee.add(new Employee(1, "Sravya", (long) 500300, 28));
		employee.add(new Employee(1, "Aditya", (long) 500040, 29));
		
		List<String> nameSal = employee.stream().filter(emp->emp.getAge()>30).
							map(emp->emp.getName()+" : "+emp.getSalary()).collect(Collectors.toList());
		
		if(nameSal.contains("Nikhil")) {
			nameSal.forEach(System.out::println);	
		}
		
		
		
		
		
		System.out.println("method2");
		List<Employee> nameAndSalary = employee.stream().filter(emp->emp.getAge()>=30).
				collect(Collectors.toList());
		
		nameAndSalary.forEach(emp->System.out.println("name: "+emp.getName()+" salary: "+emp.getSalary()));
		
		
				
	}

}
