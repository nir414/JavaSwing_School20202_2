package java0823_Employee;
public abstract class Employee {
	int career, salary;
	String no, name;
	
	public Employee() {
	}
	public Employee(String no, String name, int career) {
		this.no = no;
		this.name = name;
		this.career = career;
	}
	
	public abstract void paySalary();
	public void printInfo() {
		System.out.println("번호: "+no+" 이름: "+name+" 월금: "+salary+"만원");
	}
}