import java.util.Arrays;
import java.util.Scanner;

public class A1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()) {
			int count=cin.nextInt();
		
			int[] arr=new int[count];
			for(int i=0; i<count; i++) {
				arr[i]=Integer.MIN_VALUE;
			}
			long sum=0;
			for(int i=0; i<count; i++) {
				int num=cin.nextInt();
				sum+=num*num;
				
				//insert sort
				int j=0;
				for(; j<i+1; j++) {
					if(num>arr[j]) {
						break;
					}
				}
				
				if(j!=i) {
					for(int k=i; k>j; k--) {
						int temp=arr[k];
						arr[k]=arr[k-1];
						arr[k-1]=temp;
					}
				}
				arr[j]=num;
			
			}
			
			System.out.println(arr[1]);
			System.out.println(arr[count-2]);
			System.out.println(sum);
		}
		
	}
}
