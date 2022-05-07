import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.HashSet;
//import java.util.Iterator;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		double sum = (double) 0.0;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double[] array = new double[Integer.parseInt(bf.readLine())];
	
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = Double.parseDouble(st.nextToken());
		} //array에 원래점수 입력받음
		
		Arrays.sort(array); //array 정렬
		
		double max = array[array.length - 1]; //max값 할당
		
		for(int j = 0; j<array.length;j++) {
			array[j] = array[j] / max * 100; //새 점수로 변환
		} 
		for(int k = 0; k<array.length; k++) {
			sum += array[k];
		} //새 점수의 합
		System.out.println(sum/array.length); //새 점수의 평균
	}
}