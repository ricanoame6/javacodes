
public class MusicTester {
	public static void main(String[] args) {
		Music music = new Music("ÈïºÎÀü", 1700);
		System.out.println(music);
		
		Classic classic = new Classic("¿î¸í", 1808, "º£Åä¹ê");
		System.out.println(classic);
		
		Pop pop = new Pop("º¸Çì¹Ì¾È ·¦¼Òµð", 1980, "Äý");
		System.out.println(pop);
	}
}
