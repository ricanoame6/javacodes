/*import java.util.Scanner;
//���� ū �� ã��
public class ArrayTest 
{
    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);
    
    int intArray[] = new int[5];
    int max = 0;
    System.out.println("��� 5���� �Է��ϼ���.");
    
    for(int i = 0; i<5; i++) 
    {
    	intArray[i] = scanner.nextInt();
    	if(intArray[i] > max)
    		max = intArray[i];
    }
    System.out.print("���� ū ���� " +max+" �Դϴ�.");
    scanner.close();
    }
    
}
*/
//��������(������ ����)

public class ArrayTest
{
    static int[] makeArray() {
        int temp[] = new int[4];
        for(int i = 0; i < temp.length; i++)
            temp[i] = i; // �迭 �ʱ�ȭ
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
    
    