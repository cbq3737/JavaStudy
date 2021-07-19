package ch16;

public class Employee {
	
	private static int serialNum =1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		this.serialNum++;
		this.employeeId = serialNum;//이렇게 안해줄 시 모든 인스턴스가 같은 id를 갖게 된다. 
	}
	public static int getSerialNum() {
	
		return serialNum;
	}
	
	public int getEmployee() {
		return employeeId;
	}
	public void setEmployee(int employee) {
		this.employeeId = employee;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
