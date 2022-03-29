/*import java.util.Scanner;
//가장 큰 수 찾기
public class ArrayTest 
{
    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);
    
    int intArray[] = new int[5];
    int max = 0;
    System.out.println("양수 5개를 입력하세요.");
    
    for(int i = 0; i<5; i++) 
    {
    	intArray[i] = scanner.nextInt();
    	if(intArray[i] > max)
    		max = intArray[i];
    }
    System.out.print("가장 큰 수는 " +max+" 입니다.");
    scanner.close();
    }
    
}
*/
//참조전달(포인터 방향)

public class ArrayTest
{
    static int[] makeArray() {
        int temp[] = new int[4];
        for(int i = 0; i < temp.length; i++)
            temp[i] = i; // 배열 초기화
        return temp;
    }
    public static void main(String[] args)
    {
    	int intArray[];
    	intArray = makeArray();
    	for(int i = 0; i<intArray.length; i++)
    		System.out.print(intArray[i] + " ");
    }
}
    
    