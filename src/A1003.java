
public class A1003 {
	private final static int ROW=25;
	private final static int COLUMN=18;
	
	public static void main(String[] args) {
		char[][] str=new char[ROW][COLUMN];
		int min=Math.min(ROW, COLUMN),
				max=Math.max(ROW, COLUMN);
		for(int i=0; i<min; i++) {
			char c='A';
			for(int j=i; j<max; j++) {
				if(j<COLUMN) {
					str[i][j]=c;
				}
				if(j<ROW) {
					str[j][i]=c;
				}
				c++;
			}
		}
		
		for(int i=0; i<ROW; i++) {
			System.out.println(String.valueOf(str[i]));
		}
		
	}
}
