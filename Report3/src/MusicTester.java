
public class MusicTester {
	public static void main(String[] args) {
		Music music = new Music("�����", 1700);
		System.out.println(music);
		
		Classic classic = new Classic("���", 1808, "�����");
		System.out.println(classic);
		
		Pop pop = new Pop("����̾� ���ҵ�", 1980, "��");
		System.out.println(pop);
	}
}
