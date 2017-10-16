import java.util.Scanner;

public class A1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()) {
			int count=cin.nextInt();
			
			int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
			long sum=0;
			for(int i=0; i<count; i++) {
				int num=cin.nextInt();
				min=Math.min(min, num);
				max=Math.max(num, max);
				sum+=num;
			}
			
			System.out.println(max);
			System.out.println(min);
			System.out.println(sum);
		}
	}

}
