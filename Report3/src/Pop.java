
public class Pop extends Music {
	
	public String singer;
	
	public Pop(String name, int year, String singer) {
		super(name, year);
		this.singer = singer;
		toString();
	}
	@Override
	public String toString() {
		return "Pop [���=" + getName() + ", ����=" + getYear()+ ", ����=" + singer +"]";
	}
}