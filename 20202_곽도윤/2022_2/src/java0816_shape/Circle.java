package java0816_shape;
public class Circle extends Shape{
	private int radius;
	
	public Circle() {
	}
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	} 
	
	public void draw() {
		super.draw();
		System.out.println("(원) 반지름: "+radius);
	}
	public void calculateArea() {
		System.out.println("반지름이 "+radius+"인 원의 넓이는 "+radius*radius*PI+"입니다.");
	}
	public void calculateRound() {
		System.out.println("반지름이 "+radius+"인 원의 둘레는 "+2*radius*PI+"입니다.");
	}
}