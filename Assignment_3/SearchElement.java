import java.util.Scanner;

class SearchElement{
	static Scanner sc = new Scanner(System.in);
	static void readArr(int[] arr){
		System.out.println("Enter the elements :");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
	}
	static void displayArr(int[] arr){
		System.out.println("Array elements are :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public static int searchEle(int[] arr, int key){
		for(int i=0;i < arr.length;i++){
			if(arr[i] == key)
				return i;
		}
		return -1;
	}
	public static void main(String args[]){
		System.out.println("Enter the size :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		readArr(arr);
		displayArr(arr);
		System.out.println("Enter the key to Search :");
		int key = sc.nextInt();
		int idx = searchEle(arr, key);
		if(idx > 0)
			System.out.println("Element found at "+idx+" index");
		else
			System.out.println("Element not found!");
	}
}