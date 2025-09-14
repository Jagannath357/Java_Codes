import java.util.*;

class AddMatrices{
	static Scanner sc = new Scanner(System.in);
	static int[][] readMatrix(){
		System.out.println("Enter no. of rows and columns :");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] mat = new int[r][c];
		System.out.println("Enter the elements :");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;
	}
	static void displayMatrix(int[][] mat){
		for(int i[] : mat){
			for(int j : i){
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		System.out.print("\n");
	}
	public static int[][] addMatrices(int[][] mat1, int[][] mat2){
		int c1 = mat1[0].length;
		int c2 = mat2[0].length;
		int r1 = mat1.length;
		int r2 = mat2.length;
		int[][] mat3 = new int[r1][c1];
		if(r1 != r2 && c1 != c2){
			return null;
		}
		else{
			for(int i=0;i < r1;i++){
				for(int j =0;j<c1;j++){
					mat3[i][j] = mat1[i][j] + mat2[i][j];
				}
			}
		}
		return mat3;
	}
	public static void main(String args[]){
		
		System.out.println("Enter matrix 1 :");
		int[][] mat1 = readMatrix();
		
		System.out.println("Enter matrix 2 :");
		int[][] mat2 = readMatrix();
		
		/* System.out.println("Elements of Matrix 1 :");
		displayMatrix(mat1);
		System.out.println("Elements of Matrix 2 :");
		displayMatrix(mat2); */
		
		int[][] mat3 = addMatrices(mat1, mat2);
		if(mat3 == null){
			System.out.println("Addition not possible!");
		}else{
			System.out.println("Addition Matrix :");
			displayMatrix(mat3);
		}
		
	}
}