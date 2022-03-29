package lecture5_2;

public class Mypoint{
	private int x, y;
	
	protected Mypoint(){
		this.x = 100; this.y = 200;
	}
	protected void disp() {
		System.out.println("Á¡(x, y) = (" + x + ", " + y + ")");
	}
}
