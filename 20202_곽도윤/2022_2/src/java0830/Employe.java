package java0830;

public abstract class Employe {
	String no, name;
	int career, salary;
	
	public Employe() {
		// TODO Auto-generated constructor stub
	}
	public Employe(String no, String name, int career) {
		this();
		this.no = no;
		this.name = name;
		this.career = career;
	}
	public abstract void paySalary();
	public void printInfo() {
		System.out.println("번호: "+no+", 이름: "+name+", 월급: "+salary+"만원");
	}
}
