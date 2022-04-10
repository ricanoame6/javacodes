
public class Pop extends Music {
	
	public String singer;
	
	public Pop(String name, int year, String singer) {
		super(name, year);
		this.singer = singer;
		toString();
	}
	@Override
	public String toString() {
		return "Pop [곡명=" + getName() + ", 연도=" + getYear()+ ", 가수=" + singer +"]";
	}
}