import java.util.Scanner;
public class Cafe {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int caffuchino = 3000;
		int caffelatte = 3500;
		int americano = 2500;
		
		System.out.print("Ŀ���ֹ��ϼ���>>");
		
		String coffee = scanner.next();
		int q = scanner.nextInt();
		
		//if ��� ����
		/*if (coffee.equals("īǪġ��"))
		{
			System.out.println(caffuchino * q + "�� �Դϴ�.");
		}
		else if (coffee.equals("ī���"))
		{
			System.out.println(caffelatte * q + "�� �Դϴ�.");
		}
		else if (coffee.equals("�Ƹ޸�ī��"))
		{
			System.out.println(americano * q + "�� �Դϴ�.");
		}
		*/
		
		// switch ��� ����
		switch(coffee) {
		
		case "īǪġ��": System.out.println(caffuchino * q + "�� �Դϴ�."); break;
		case "�Ƹ޸�ī��": System.out.println(americano * q + "�� �Դϴ�."); break;
		case "ī���": System.out.println(caffelatte * q + "�� �Դϴ�."); break;
			
		}
		scanner.close();
		return;
	}

}
