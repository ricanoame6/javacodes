import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array;
		
		int test = Integer.parseInt(bf.readLine()); //몇번 테스트 할것인가
		StringTokenizer st;
		
		for(int i = 0 ; i < test ; i++) { 
			st = new StringTokenizer(bf.readLine()," "); // 학생 수, 성적 입력
			int N = Integer.parseInt(st.nextToken());	//학생 수 할당하고 날리기
			array = new int[N];			
			double sum = 0;	// 성적 누적 합 변수 
			
			// 성적 입력부분 
			for(int j = 0 ; j < N ; j++) {
				int value = Integer.parseInt(st.nextToken());	// 한 토큰씩 저장
				array[j] = value;
				sum += value;	// 성적 합계
			}			
			double m = (sum / N) ;
			double count = 0; // 평균 넘는 학생 수 			
			// 평균 넘는 학생 비율 찾기 
			for(int j = 0 ; j < N ; j++) {
				if(array[j] > m) {
					count++;	
				}
			}			
			System.out.printf("%.3f%%\n",(count/N)*100); 
			//%.3f로 출력 포멧 지정, % 쓸려면 %% 써야됨
		}
	}
}