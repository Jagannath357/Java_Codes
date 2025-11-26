import java.util.Scanner;

public class DriverSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String words[] = str.trim().split(" ");
        for (String word : words) {
            sb.append(word.charAt(0));
        }
        System.out.println("Your Initials : "+sb.toString().toUpperCase());
    }
}
