import java.util.Scanner;

public class Report1 {
	
	static void method1()
	{
		Scanner scanner = new Scanner(System.in);
		boolean tf = true;
		int total = 0;
		int count = -1;
		
		while (tf)
		{
			count++;
			System.out.print("Enter grade: ");
		    int grade = scanner.nextInt();
		    total += grade;

		    if (count == 0 && total < 0)
		    {
		    	System.out.println("0은 나눌 수 없습니다.");
		    	tf = false;
		    }
		    else if (grade < 0)
		    {
		    	total += -grade;
		    	int average = total / count;
		    	System.out.println("Total of "+count+" student grades is "+ total);
		    	System.out.println("Class average is " + average);
		    	tf = false;
		    }
		}
		return;
	}
	
	static void method2()
	{
		Scanner scanner = new Scanner(System.in);
		boolean tf = true;
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countF = 0;
		
		while (tf)
		{
			//System.out.println("메소드2실행");
			System.out.print("Enter grade: ");
		    int grade = scanner.nextInt();
		    int key = grade / 10;
		    
		    if (grade > 100)
		    {
		    	System.out.println("0~100 범위의 정수를 입력해 주세요!");
		    }
			switch (key)
			{
			    case 10: ++countA;
			        break;
			    case 9: ++countA;
			        break;
			    case 8: ++countB;
			        break;
			    case 7: ++countC;
			        break;
			    case 6: ++countD;
			        break;
			}
			if (key < 6 && key > 0)
			{
			    countF++;
			}
			if (grade >= 0 && grade < 10)
			{
				countF++;
			}
			if (grade < 0)
			{
				System.out.println("Number of students who received each grade: ");
				System.out.println("A: "+ countA);
				System.out.println("B: "+ countB);
				System.out.println("C: "+ countC);
				System.out.println("D: "+ countD);
				System.out.println("F: "+ countF);
				
				tf = false;
			}
		}
		return;
	}
	
	static void method3()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하세요: ");
		int money = scanner.nextInt();
		int fiftyThousand = money/50000 ;
		int tenThousand = (money - fiftyThousand*50000) / 10000;
		int thousand = (money - fiftyThousand*50000 - tenThousand*10000) / 1000;
		int hundred = (money - fiftyThousand*50000-tenThousand*10000-thousand*1000) / 100;
		int fifty = (money - fiftyThousand*50000-tenThousand*10000-thousand*1000-hundred*100) / 50;
		int ten = (money - fiftyThousand*50000-tenThousand*10000-thousand*1000-hundred*100-fifty*50) / 10;

		if (fiftyThousand == 0) {
		}
		else 
		{
			System.out.println("오만원 "+fiftyThousand+"매");
		}
		
		if (tenThousand == 0){
		}
		else 
		{
			System.out.println("만원 "+tenThousand+"매");
		}
		if (thousand == 0){
		}
		else 
		{
			System.out.println("천원 "+thousand+"매");
		}
		if (hundred == 0){
		}
		else 
		{
			System.out.println("백원 "+hundred+"매");
		}
		if (fifty == 0){
		}
		else 
		{
			System.out.println("오십원 "+fifty+"매");
		}
		if (ten == 0){
		}
		else 
		{
			System.out.println("십원 "+ten+"매");
		}
		return;
	}

	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}

}
