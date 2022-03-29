package lecture5_2;

public class MyRect extends Mypoint{
	int w; int h;
	MyRect(){
		this.w = 200; this.h = 300;
	}
	protected void disp() {
		super.disp()
		System.out.println("Æø = " + w + "³ôÀÌ = " + h);
	}
}
