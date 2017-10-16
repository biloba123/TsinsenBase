import java.util.Scanner;

public class A1007 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int sum=cin.nextInt();
			findFive(sum);
			if(sum%2==0) {
				findSix(sum);
			}
		}
	}
	
	private static void findFive(int num) {
		for(int i=10; i<100; i++) {
			int sum=sumNum(i),
					cha=num-sum*2;
			if(cha>=0&&cha<=9) {
				System.out.print(i);
				System.out.print(cha);
				System.out.println(i%10*10+i/10);
			}
		}
	}
	
	private static void findSix(int num) {
		int n=num/2;
		for(int i=100; i<1000; i++) {
			if(sumNum(i)==n) {
				System.out.print(i);
				System.out.print(i%10);
				System.out.print(i/10%10);
				System.out.println(i/100);
			}
		}
	}
	
	private static int sumNum(int num) {
		int sum=0;
		for(; num != 0; num/=10) {
			sum+=num%10;
		}
		return sum;
	}
}
