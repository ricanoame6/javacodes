
public class Classic extends Music {	
	private String composer;

	public Classic(String name, int year, String composer){ //�����ڿ� ����Ÿ�� ������ȵ�
		super(name, year); //����Ŭ������ ������ ȣ��
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
		return getName() + "�� �����մϴ�";
	}
	public String getComposer(){
		return composer;
	}
	public String setComposer(String composer){
		return this.composer = composer;
	}
	@Override
	public void print(){
		System.out.println("��� = " + name + ", ���� = " + year + ", �۰ = " + composer);
		System.out.println(play());
	}
}
