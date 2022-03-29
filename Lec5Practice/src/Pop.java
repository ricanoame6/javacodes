public class Pop extends Music {	
	private String singer;

	public Pop(String name, int year, String singer){ //생성자에 리턴타입 넣으면안됨
		super(name, year); //수퍼클래스의 생성자 호출
		this.singer = singer;
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
	public String getSinger(){
		return singer;
	}
	public String setSinger(String singer){
		return this.singer = singer;
	}
	@Override
	public void print(){
		System.out.println("곡명 = " + name + ", 연도 = " + year + ", 가수 = " + singer);
		System.out.println(play());
	}
}