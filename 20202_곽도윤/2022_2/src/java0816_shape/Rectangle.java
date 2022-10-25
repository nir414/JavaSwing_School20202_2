package java0816_shape;
public class Rectangle extends Shape{
	private int width, height;
	
	public Rectangle() {
	}
	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		super.draw();
		System.out.println("(�����簢��), ����: "+width+", ����: "+height);
	}
	public void calculateArea() {
		System.out.println("���̰� "+width+", ���̰� "+height+"�� �����簢���� ���̴� "+width*height+"�Դϴ�.");
	}
	public void calculateRound() {
		System.out.println("���̰� "+width+", ���̰� "+height+"�� �����簢���� �ѷ��� "+(width*2+height*2)+"�Դϴ�.");
	}
}