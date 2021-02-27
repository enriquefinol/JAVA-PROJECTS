
public class SudokuValidation {

	public static void main(String[] args) {
  //Example of solution
		int[][] grid ={
			{5, 3, 4, 6, 7, 8, 9, 1, 2},
			{6, 7, 2, 1, 9, 5, 3, 4, 8},
			{1, 9, 8, 3, 4, 2, 5, 6, 7},
			{8, 5, 9, 7, 6, 1, 4, 2, 3},
			{4, 2, 6, 8, 5, 3, 7, 9, 1},
			{7, 1, 3, 9, 2, 4, 8, 5, 6},
			{9, 6, 1, 5, 3, 7, 2, 8, 4},
			{2, 8, 7, 4, 1, 9, 6, 3, 5},
			{3, 4, 5, 2, 8, 6, 1, 7, 9}
			};

		System.out.println(isValid(grid) ? "Valid Solution" : "Invalid Solution");
	}
	
	public static boolean isValid (int[][] grid) {
		for(int i =0; i<9;i++) {
			for (int j = 0;j<9; j++) {
				if(grid[i][j] <1 || grid[i][j]>9 || !checkBox(grid, i , j)) {
					return false;
				}
			}
		}
		return true;	
	}
	
	public static boolean checkBox( int[][] grid, int x, int y) {
		//check rows
		for(int col =0; col<9;col++) {

			if(col != y && grid[x][y] == grid[x][col]) {
				return false;
			}
		}
		//check column
		for (int row = 0; row<9;row++) {
			//System.out.println(i);
			if(row != x  && grid[x][y] == grid[row][y]) {

				return false;
			}
		}
		//checkminibox
		for(int Row= (x/3) *3 ;Row < (x/3) *3 + 3 ;Row++) {
			for(int Col= (y/3) *3; Col < (y/3) *3 +3;Col++) {
				if(!(Row == x && Col == y) && grid[x][y] == grid[Row][Col]) {

					return false;
				}
			}
		}
		return true;
		


	}

}
