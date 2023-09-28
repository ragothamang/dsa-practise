package dsaPractise.com.array;

// 
public class TwoDArraySprialOrderMatrix {
	public static int[][] generateMatrix(int A) {
		int res[][] = new int[A][A];
		int n = A;
		int num = 1;
		int row = 0;
		int col = n-1;
		while(row < col){          
			 System.out.println("  row  "+ row +"  col "+ col);
			 for(int i = row;i<=row;i++){
				for(int j = row;j<col;j++){
					 System.out.print(num+"  ");
					res[i][j] = num;
					num++;
				}
			}
			 System.out.println(" L-R ");

			for(int i = row;i<=col-1;i++){
				for(int j = col;j<=col;j++){
					 System.out.print(num+"  ");
					res[i][j] = num;
					num++;
				}
			}

			for(int i = col;i<=col;i++){
				for(int j = col;j>row;j--){
					 System.out.print(num+"  ");
					res[i][j] = num;
					num++;
				}
			}

			for(int i = col;i>row;i--){
				for(int j = row;j>=row;j--){
					 System.out.print(num+"  ");
					res[i][j] = num;
					num++;
				}
			}
			row++;
			col--;
		}
		 System.out.println(" num -->  "+ num);
		if(row==col){
			res[row][row] = num;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res[][] = generateMatrix(5);
		for(int i =0;i<res.length;i++) {
			for(int j=0;j<res[0].length;j++) {
				System.out.print(res[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
