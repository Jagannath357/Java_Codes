import java.util.Scanner;

class SearchThread extends Thread {
    private int start, end;
    int arr[];
    private static int minEle = Integer.MAX_VALUE;
    private static final Object lock = new Object();
    public SearchThread(int arr[], int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    public void run() {
        int min = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        synchronized (lock) {
            if (min < minEle) {
                minEle = min;
            }
        }
    }
    public static int getMinEle() {
        return minEle;
    }   
}
public class DriverEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of threads (m): ");
        int m = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SearchThread[] threads = new SearchThread[m];
        int elementsPerThread = n / m;
        int start = 0;
        for (int i = 0; i < m; i++) {
            int end = (i == m - 1) ? n-1 : start + elementsPerThread - 1;
            threads[i] = new SearchThread(arr, start, end);
            threads[i].start();
            start = end + 1;
        }
        for (int i = 0; i < m; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("The minimum of " + n + " array elements is: " + SearchThread.getMinEle());
    }
    
}