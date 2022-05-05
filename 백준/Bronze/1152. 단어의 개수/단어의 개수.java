import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	public Main() 
	{
		ArrayList<String> a = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine(); //문자열 입력받음 next()는 공백이전만 받음!!!
		
		StringTokenizer st = new StringTokenizer(phrase); 
		while(st.hasMoreTokens())
		{
			String nt = st.nextToken();
			a.add(nt);
		}
		System.out.println(a.size());
	}
	public static void main(String[] args) {
		Main main = new Main();
	}
}	