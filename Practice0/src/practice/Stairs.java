package practice;
import java.util.Scanner;

public class Stairs {

	
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int spacecount=0;
		
		
		for (int i = 0; i < n; i++) {
			spacecount=(n-(i+1));
			/*System.out.println(spacecount);
			System.out.println(n-spacecount);*/
			System.out.println(new String(new char[spacecount]).replace("\0", " ")+new String(new char[n-spacecount]).replace("\0", "#"));
		}
	}
}
