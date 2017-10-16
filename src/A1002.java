
public class A1002 {
	
	public static void main(String[] args) {
		String str="000000";
		for(int i=0; i<64; i++) {
			String s=Integer.toBinaryString(i);
			if(isOodStr(s)) {
				System.out.println(str.substring(s.length())+s);
			}
		}
	}
	
	private static boolean isOodStr(String s) {
		int oneCount=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='1') {
				oneCount++;
			}
		}
		return oneCount%2==1;
	}
}
