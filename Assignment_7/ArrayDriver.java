import java.util.Scanner;

public class ArrayDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 52, 56, 98, 75, 74, 55, 41, 45, 12, 65, 76, 98, 25, 64, 50};
        while (true) {
            System.out.print("Enter the index : ");
            int idx = sc.nextInt();
            try {
                if (idx+1 > arr.length) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error : Your Index is Greater than the Array Length (16) !\nEnter again\n");
                continue;
            }
            System.out.println("Position : "+(idx+1)+", Value : "+arr[idx]);
            break;
        }

    }
}
