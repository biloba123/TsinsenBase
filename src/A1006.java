
public class A1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1000; i<10000; i++) {
			if(isReturnNum(i)) {
				System.out.println(i);
			}
		}
	}
	
	private static boolean isReturnNum(int num) {
		int a=num/1000, b=num/100%10,
				c=num/10%10, d=num%10;
		return a==d && c==b;
	}

}
