import java.util.Scanner;
import btech.Student;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll no: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter 3 sub marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        
        Student s = new Student(roll, name, m1, m2, m3);

        
        s.display();

        int total = s.getTotal();
        double percentage = s.getPercentage();

        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + (int) percentage);
        System.out.println("---------------------------");
    }
}

