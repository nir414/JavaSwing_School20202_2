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
		System.out.println("(직각사각형), 넓이: "+width+", 높이: "+height);
	}
	public void calculateArea() {
		System.out.println("넓이가 "+width+", 높이가 "+height+"인 직각사각형의 넓이는 "+width*height+"입니다.");
	}
	public void calculateRound() {
		System.out.println("넓이가 "+width+", 높이가 "+height+"인 직각사각형의 둘레는 "+(width*2+height*2)+"입니다.");
	}
}