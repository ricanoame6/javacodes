import java.util.Scanner;

public class Account1 {
	Scanner scanner = new Scanner(System.in);
	
	private String name; //�������� �̸�
    private double balance; //�������� �ܰ�
    
	public Account1(String n)
	{ 
		//balance = scanner.nextDouble(); //�ܰ��Է¹��� 
		//Account account = new Account(balance);  //�Է¹��� ���ڸ� account Ŭ������ balance������ ����
		name = n; //�̸��� account1Ŭ������ ����
		double balance = this.balance;
	}
		
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	public void credit(double b)
	{
		Account account = new Account(b); //accountŬ������ balance�� ����� account1Ŭ������ balance���� ����ȵ�
		this.balance = account.getBalance();
	}
	public void print()
	{
		System.out.println("������: "+ name);
		System.out.println("�ܾ�: " + getBalance());
	}
	public void addInterest(double interestRates)
	{
			balance += balance * interestRates / 100;
	}
}
