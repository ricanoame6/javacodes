
abstract class MyPoint {
	private int x = 0;
	private int y = 0;
	
	public MyPoint(int x, int y) { 
		this.x = x; this.y = y;
	}
	protected abstract void move(int x, int y);
	protected abstract void reverse(); //(x, y)에서 (y, x) 로 위치 면경)
	protected void show() {}
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
}

