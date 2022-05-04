import java.util.Scanner;

public class Main {
	public Main() {
		int a0 = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int a7 = 0;
		int a8 = 0;
		int a9 = 0;
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = a*b*c;
		String sd = Integer.toString(d); //d 값을 스트링으로
		//d = 17037300 -> 0 3번 1 1번 ...
		int d_len = sd.length(); //d의 길이
		for(int i = d_len - 1; i >=0; i--) { //역for문
			switch(Character.getNumericValue(sd.charAt(i))) {
				case 0 :
					++a0;
					break;
				case 1:
					++a1;
					break;
				case 2:
					++a2;
					break;
				case 3:
					++a3;
					break;
				case 4:
					++a4;
					break;
				case 5:
					++a5;
					break;
				case 6:
					++a6;
					break;
				case 7:
					++a7;
					break;
				case 8:
					++a8;
					break;
				case 9:
					++a9;
					break;	
			}
		}
		System.out.println(a0);

		System.out.println(a1);

		System.out.println(a2);

		System.out.println(a3);

		System.out.println(a4);

		System.out.println(a5);

		System.out.println(a6);

		System.out.println(a7);

		System.out.println(a8);

		System.out.println(a9);
	}
	public static void main(String[] args) {
		Main main = new Main();
	}
}	

