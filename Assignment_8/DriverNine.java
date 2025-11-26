import java.util.Scanner;

class OddIndexProduct extends Thread {
    int[] a, b, result;
    OddIndexProduct(int[] a, int[] b, int[] result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }
    public void run() {
        for (int i = 1; i < a.length; i += 2) {
            result[i] = a[i] * b[i];
        }
    }
}
class EvenIndexProduct extends Thread {
    int[] a, b, result;
    EvenIndexProduct(int[] a, int[] b, int[] result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }
    public void run() {
        for (int i = 0; i < a.length; i += 2) {
            result[i] = a[i] * b[i];
        }
    }
}
public class DriverNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();
        EvenIndexProduct evenThread = new EvenIndexProduct(arr1, arr2, result);
        OddIndexProduct oddThread = new OddIndexProduct(arr1, arr2, result);
        evenThread.start();
        oddThread.start();
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Product of corresponding elements:");
        for (int i = 0; i < n; i++)
            System.out.print(result[i]+"  ");

        System.out.println();
    }
}