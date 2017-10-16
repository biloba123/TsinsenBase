import java.util.Scanner;

public class A1004 {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()) {
			char[][] rect=drawRect(cin.nextInt(), cin.nextInt());
			for(int i=0; i<rect.length; i++) {
				System.out.println(String.valueOf(rect[i]));
			}
		}
		
	}
	
	private static char[][] drawRect(int row, int column){
		char[][] rect=new char[row][column];
		
		int min=Math.min(row, column),
				max=Math.max(row, column);
		for(int i=0; i<min; i++) {
			char c='A';
			for(int j=i; j<max; j++) {
				if(j<column) {
					rect[i][j]=c;
				}
				if(j<row) {
					rect[j][i]=c;
				}
				c++;
			}
		}
		
		return rect;
	}
}
