
public class A1001 {

	public static void main(String[] args) {
		String str="000000";
		for(int i=0; i<64; i++) {
			String s=Integer.toBinaryString(i);
			System.out.println(str.substring(s.length())+s);
		}
	}

}
