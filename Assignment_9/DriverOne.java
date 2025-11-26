import java.util.Scanner;

public class DriverOne {
    public static String reverseStr(String str){
        String res = "";
        for (char ch : str.toCharArray()) {
            res = ch+res;
        }
        return res;
    }
    public static boolean isPalindrom(String str){
        return str.equals(reverseStr(str));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        System.out.println("Reverse String = "+reverseStr(str));
        
        if (isPalindrom(str)) {
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}
