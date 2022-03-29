
public class Classic extends Music {	
	private String composer;

	public Classic(String name, int year, String composer){ //생성자에 리턴타입 넣으면안됨
		super(name, year); //수퍼클래스의 생성자 호출
		this.composer = composer;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getYear() {
		return year;
	}
	@Override
	public String play(){
		return getName() + "을 연주합니다";
	}
	public String getComposer(){
		return composer;
	}
	public String setComposer(String composer){
		return this.composer = composer;
	}
	@Override
	public void print(){
		System.out.println("곡명 = " + name + ", 연도 = " + year + ", 작곡가 = " + composer);
		System.out.println(play());
	}
}
