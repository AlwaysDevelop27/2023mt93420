package firstpjt.firstpjt;

public class Employee {

	private int empId;
	private String name;
	private Long Salary;
	private int age;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employee(int empId, String name, Long salary, int age) {
		super();
		this.empId = empId;
		this.name = name;
		Salary = salary;
		this.age = age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
