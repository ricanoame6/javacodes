import java.util.Scanner;
public class Cafe {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int caffuchino = 3000;
		int caffelatte = 3500;
		int americano = 2500;
		
		System.out.print("커피주문하세요>>");
		
		String coffee = scanner.next();
		int q = scanner.nextInt();
		
		//if 사용 예시
		/*if (coffee.equals("카푸치노"))
		{
			System.out.println(caffuchino * q + "원 입니다.");
		}
		else if (coffee.equals("카페라떼"))
		{
			System.out.println(caffelatte * q + "원 입니다.");
		}
		else if (coffee.equals("아메리카노"))
		{
			System.out.println(americano * q + "원 입니다.");
		}
		*/
		
		// switch 사용 예시
		switch(coffee) {
		
		case "카푸치노": System.out.println(caffuchino * q + "원 입니다."); break;
		case "아메리카노": System.out.println(americano * q + "원 입니다."); break;
		case "카페라떼": System.out.println(caffelatte * q + "원 입니다."); break;
			
		}
		scanner.close();
		return;
	}

}
