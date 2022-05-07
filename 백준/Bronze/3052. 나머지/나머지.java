import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader	bf = new BufferedReader(new InputStreamReader(System.in)); 
		HashSet<Integer> numbers = new HashSet<Integer>(); //set 인터페이스의 구현 클래스 HashSet
		numbers.add(Integer.parseInt(bf.readLine())% 42);
		numbers.add(Integer.parseInt(bf.readLine())% 42);
		numbers.add(Integer.parseInt(bf.readLine())% 42);
		numbers.add(Integer.parseInt(bf.readLine())% 42);
		numbers.add(Integer.parseInt(bf.readLine())% 42);
		numbers.add(Integer.parseInt(bf.readLine())% 42);
		numbers.add(Integer.parseInt(bf.readLine())% 42);
		numbers.add(Integer.parseInt(bf.readLine())% 42);
		numbers.add(Integer.parseInt(bf.readLine())% 42);
		numbers.add(Integer.parseInt(bf.readLine())% 42);
		//System.out.println("입력완료");
		Iterator iter = numbers.iterator();	// Iterator 사용
		/*
		while(iter.hasNext()) {//값이 있으면 true 없으면 false
		    System.out.println(iter.next() + " ");
		}
		*/
	    System.out.println(numbers.size());
	}
}