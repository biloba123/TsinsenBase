
public class A1005 {
	public static void main(String[] args) {
		for(int i=100; i<1000; i++) {
			if(isMyNum(i)) {
				System.out.println(i);
			}
		}
	}
	
	private static boolean isMyNum(int num) {
		return (cube(num/100)+cube(num/10%10)+cube(num%10))==num;
	}
	
	private static int cube(int num) {
		return (int) Math.pow(num, 3);
	}
}
