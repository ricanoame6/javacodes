import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bww = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] ABV = brr.readLine().split(" ");
		
		double A = Integer.parseInt(ABV[0]); // 낮동안 올라가는 길이
		double B = Integer.parseInt(ABV[1]); // 밤동안 미끄러지는 길이
		double V = Integer.parseInt(ABV[2]); // 나무 막대의 길이
		
		int X = (int) Math.ceil((V - B) / (A - B)); // 올라가는 데 걸리는 일 수
		
		bww.write(String.valueOf(X));
		
		brr.close();
		bww.flush();
		bww.close();
	}
}