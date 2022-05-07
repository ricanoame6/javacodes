import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.HashSet;
//import java.util.Iterator;

public class Main{
	public static void main(String[] args) throws IOException{
		int j = 1;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(bf.readLine());
		for(int i = 1; i<= k; i++) {
			j *= i;
		}
		System.out.println(j);
	}
}