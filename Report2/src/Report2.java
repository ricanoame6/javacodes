import java.util.Scanner;

public class Report2 {
	static void method1() 
	{
		Scanner scanner = new Scanner(System.in);
		double deposit1;
		double deposit2;
		
		// Account1 클래스를 참조하여 account1과 account2의 deposit를 입력받아 각각의
		// balance를 디스플레이하는 메소드를 작성하시오
		
		System.out.print("Enter deposit amount for account1 : ");
		//Account1 account1 = new Account1("홍길동"); //이름저장
		double balance = scanner.nextDouble(); //잔고입력받음 
		Account account = new Account(balance);  //입력받은 숫자를 account 클래스의 balance변수에 저장
		deposit1 = account.getBalance();
		
		System.out.print("Enter deposit amount for account2 : ");
		double balance2 = scanner.nextDouble(); 
		Account account2 = new Account(balance2); 
		deposit2 = account2.getBalance();
		
		System.out.println("account1 balance: $" + deposit1);
		System.out.println("account2 balance: $" + deposit2+"\n");
	}
	static void method2()
	{
		Account1 account = new Account1("홍길동");
		// 아래 코드를 참조하여 홍길동 예금주의 잔액과 이자률을 계산한 잔액을 디스플레이하는
		// 메소드를 구현
		account.credit(1000.0);
		account.print();
		account.addInterest(1.1);
		account.print();
		System.out.print("\n");
	}
	static void method3() 
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter first integer : ");
	    int first = scanner.nextInt();
	    System.out.print("Enter second integer : ");
	    int second = scanner.nextInt();
	    int sum = first + second;
	    System.out.println("Sum is "+ sum );
	    int product = first * second;
	    System.out.println("Priduct is "+ product );
	    int difference = first - second;
	    System.out.println("Difference is "+ difference );
	    int quotient = first / second;
	    System.out.println("Quotient is "+ quotient );
	}
	public static void main(String[] args)
	{
		method1();
		method2();
		method3();
	}
}
