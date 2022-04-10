
public class MyColorPoint extends MyPoint{
	
	String color;
	int tmp;
	
	public MyColorPoint(int x, int y, String color) {
		super(x, y); this.color = color;		
	}
	@Override
	protected void move(int x, int y) {
		setX(x); setY(y);
	}
	@Override
	protected void reverse() {
		tmp = getX();
		setX(getY());
		setY(tmp);
	}
	
	@Override
	public void show() {System.out.print(getX() + " " + getY() + " " + color);}
	
	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2, 3 ,"blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}
}
