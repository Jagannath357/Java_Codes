import java.util.*;

class JaggedArray{
	static Scanner sc = new Scanner(System.in);
	static void fillArray(int arr[]){
		System.out.println("Enter the Elements :");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	static int[][] readArr(){
		System.out.println("\nEnter no. of rows :");
		int r = sc.nextInt();
		int[][] arr = new int[r][];
		
		for(int i=0; i<r; i++){
			System.out.println("Enter no. of columns for row "+(i+1)+" :");
			int c = sc.nextInt();
			
			arr[i] = new int[c];
			System.out.println("Enter the elements");
			for(int j=0; j<c; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	static void displayArr(int[][] arr){
		for(int i[] : arr){
			for(int j : i){
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		System.out.print("\n");
	}
	
	public static void main(String args[]){
		
		int arr[][];
		arr = readArr();
		System.out.println("\nArray Elements are :");
		displayArr(arr);
		
		
	}
}