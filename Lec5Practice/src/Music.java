
public abstract class Music implements Payable {
	String name;
	int year;
	
	Music(String name, int year){   //»ý¼ºÀÚ
		this.name = name; this.year = year;
	}
	abstract protected String getName();
	abstract protected int getYear();
	abstract protected void print();
}
