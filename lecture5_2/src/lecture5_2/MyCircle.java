package lecture5_2;

public class MyCircle extends Mypoint{
	int r;
	MyCircle() {
		this.r = 50;
	}
	protected void disp() {
		super.disp();
		System.out.println("¹ÝÁö¸§ r =  " + r);
	}
}
