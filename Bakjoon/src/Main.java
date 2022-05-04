import java.util.ArrayList;
import java.util.Scanner;

/*
public class Main 
{
	ArrayList<Integer> list = new ArrayList<Integer>();
	int max;
	public Main() {
		for(int i = 0; i < 9; i++) {
			Scanner scan = new Scanner(System.in);
			list.add(scan.nextInt());
		}
		for(int j = 0; j < list.size(); j++) {
			if(j  == 0) {
				max = list.get(j);
			}
			else if(list.get(j)> list.get(j-1)) {
				max = list.get(j);
			} 
		}
		System.out.println(max + "\n" + (list.indexOf(max) + 1));	
	}		
	public static void main(String[] args) {
		Main main = new Main();
	}
}
*/

public class Main{
	int max;
	int where;
	
	int[] list = new int[9];
	public Main() {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 9; i++) {
			list[i] = scan.nextInt(); 
		}
		for(int j = 0; j < 9; j++) {
			if(j==0) {
				max = list[j];
			}
			else if(list[j] > max) {
				max = list[j];
			}
		}
		for(int k = 0; k < list.length; k++) {
			if(list[k] == max) {
				where = k+1;
			}
		}
		System.out.println(max + "\n" + where);
	}
	public static void main(String[] args) {
		Main main = new Main();
	}
}


