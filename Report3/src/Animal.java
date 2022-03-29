
public class Animal {
	private String name;
	
	public Animal(String name) { //생성자
		setName(name);
	}
	public void setName(String name) { //세터
		this.name = name;
	}
	public String getName() { //게터
		return name;
	}
	public String bark() {
		return "동물울음소리";
	}
}
