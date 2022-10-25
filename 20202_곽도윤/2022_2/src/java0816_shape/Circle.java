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
		System.out.println("(��) ������: "+radius);
	}
	public void calculateArea() {
		System.out.println("�������� "+radius+"�� ���� ���̴� "+radius*radius*PI+"�Դϴ�.");
	}
	public void calculateRound() {
		System.out.println("�������� "+radius+"�� ���� �ѷ��� "+2*radius*PI+"�Դϴ�.");
	}
}