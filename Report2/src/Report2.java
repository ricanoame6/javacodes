import java.util.Scanner;

public class Report2 {
	static void method1() 
	{
		Scanner scanner = new Scanner(System.in);
		double deposit1;
		double deposit2;
		
		// Account1 Ŭ������ �����Ͽ� account1�� account2�� deposit�� �Է¹޾� ������
		// balance�� ���÷����ϴ� �޼ҵ带 �ۼ��Ͻÿ�
		
		System.out.print("Enter deposit amount for account1 : ");
		//Account1 account1 = new Account1("ȫ�浿"); //�̸�����
		double balance = scanner.nextDouble(); //�ܰ��Է¹��� 
		Account account = new Account(balance);  //�Է¹��� ���ڸ� account Ŭ������ balance������ ����
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
		Account1 account = new Account1("ȫ�浿");
		// �Ʒ� �ڵ带 �����Ͽ� ȫ�浿 �������� �ܾװ� ���ڷ��� ����� �ܾ��� ���÷����ϴ�
		// �޼ҵ带 ����
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
