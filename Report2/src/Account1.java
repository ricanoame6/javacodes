import java.util.Scanner;

public class Account1 {
	Scanner scanner = new Scanner(System.in);
	
	private String name; //전역변수 이름
    private double balance; //전역변수 잔고
    
	public Account1(String n)
	{ 
		//balance = scanner.nextDouble(); //잔고입력받음 
		//Account account = new Account(balance);  //입력받은 숫자를 account 클래스의 balance변수에 저장
		name = n; //이름은 account1클래스에 저장
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
		Account account = new Account(b); //account클래스의 balance에 저장됨 account1클래스의 balance에는 저장안됨
		this.balance = account.getBalance();
	}
	public void print()
	{
		System.out.println("예금주: "+ name);
		System.out.println("잔액: " + getBalance());
	}
	public void addInterest(double interestRates)
	{
			balance += balance * interestRates / 100;
	}
}
