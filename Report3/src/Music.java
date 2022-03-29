
public class Music {
	private String name;
	private int year;
	
	protected Music(String name, int year) {
		this.name = name; this.year = year;
		toString();
	}
	public String toString() {
		return "Music [°î¸í=" + name + ", ¿¬µµ=" + year+ "]";
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
}
