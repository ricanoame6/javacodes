import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int testCase = Integer.parseInt(bf.readLine()); //테스트케이스
		
		for(int i = 0; i < testCase; i++) {
			int count = 0;
			//OOXXOXXOOO = 1 2 0 0 1 0 0 1 2 3
			st = new StringTokenizer(bf.readLine(), "X"); //OOOXOXOO -> OOO O OO
			int n = st.countTokens();
			for(int j = 0; j < n; j++) { //토큰 개수만큼 반복 (3)
				String t = st.nextToken(); // t = OOO
				int len = t.length(); //len = 3
				int len2 = len;
				for(int k = 0; k < len; k++) { // 0 1 2 반복
					count += len2;
					len2--;
				}
			}
			System.out.println(count);
		}
	}
}