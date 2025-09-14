import java.util.Scanner;

class SortArray{
	static Scanner sc = new Scanner(System.in);
	static void readArr(int[] arr){
		System.out.println("Enter the elements :");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
	}
	static void displayArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public static void sortArr(int[] arr){
		int n = arr.length;
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String args[]){
		System.out.println("Enter the size :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		readArr(arr);
		System.out.println("Array elements before sorting :");
		displayArr(arr);
		sortArr(arr);
		System.out.println("Array elements after sorting :");
		displayArr(arr);
	}
}