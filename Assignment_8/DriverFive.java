import java.util.Scanner;

class ThreadFive extends Thread {
    int m, n;
    ThreadFive(int m, int n) {
        this.m = m;
        this.n = n;
    }
    public void run() {
        if (m % 2 != 0) {
            for (int i = m; i <= n; i += 2) {
                System.out.print(i + "  ");
            }
        } else {
            for (int i = m + 1; i <= n; i += 2) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }
}
public class DriverFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        ThreadFive t1 = new ThreadFive(m, n);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        if (m % 2 == 0) {
            for (int i = m; i <= n; i += 2) {
                System.out.print(i + "  ");
            }
            System.out.println();
        } else {
            for (int i = m + 1; i <= n; i += 2) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }
}
