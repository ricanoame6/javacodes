
public class Classic extends Music{
	
	public String composer;
	
	public Classic(String name, int year, String composer) {
		super(name, year);
		this.composer = composer;
		toString();
	}
	@Override
	public String toString() {
		return "Classic [���=" + getName() + ", ����=" + getYear()+ ", �۰=" + composer +"]";
	}
}
