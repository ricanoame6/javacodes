import java.util.Scanner;
import java.util.InputMismatchException;

public class Day 
{
	public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);
	    String[] day = {"��", "��", "ȭ", "��", "��", "��", "��"};
	    boolean tf = true;;
	    while (tf) 
	    {
	    	System.out.print("������ �Է��ϼ���>>");
	    	int input;
	    	try 
	    	{
	    		input = scanner.nextInt(); 
	    	}
	    	catch(InputMismatchException e)
	    	{
	    		System.out.print("������ �Է����� �ʾҽ��ϴ�~~~");
	    		input = scanner.nextInt(); 
	    		continue;
	    	}
	    	if(input < 0) {
	    		System.out.println("���α׷��� �����մϴ�.");
	    	    break;
	    	}
	    	int index = input%day.length;
	    	System.out.println(day[index]);
	    }
	    scanner.close();
	}    
}

//lms ���� ��ġ��!!!!
