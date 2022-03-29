public class Pop extends Music {	
	private String singer;

	public Pop(String name, int year, String singer){ //�����ڿ� ����Ÿ�� ������ȵ�
		super(name, year); //����Ŭ������ ������ ȣ��
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
		return getName() + "�� �����մϴ�";
	}
	public String getSinger(){
		return singer;
	}
	public String setSinger(String singer){
		return this.singer = singer;
	}
	@Override
	public void print(){
		System.out.println("��� = " + name + ", ���� = " + year + ", ���� = " + singer);
		System.out.println(play());
	}
}