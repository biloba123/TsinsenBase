import java.util.Scanner;

public class A1010 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()) {
			System.out.println(Long.toHexString(cin.nextLong()).toUpperCase());
		}
	}
}
