import java.util.Scanner;
import java.util.InputMismatchException;

public class Day 
{
	public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);
	    String[] day = {"일", "월", "화", "수", "목", "금", "토"};
	    boolean tf = true;;
	    while (tf) 
	    {
	    	System.out.print("정수를 입력하세요>>");
	    	int input;
	    	try 
	    	{
	    		input = scanner.nextInt(); 
	    	}
	    	catch(InputMismatchException e)
	    	{
	    		System.out.print("정수를 입력하지 않았습니다~~~");
	    		input = scanner.nextInt(); 
	    		continue;
	    	}
	    	if(input < 0) {
	    		System.out.println("프로그램을 종료합니다.");
	    	    break;
	    	}
	    	int index = input%day.length;
	    	System.out.println(day[index]);
	    }
	    scanner.close();
	}    
}

//lms 보고 고치기!!!!
