import java.util.Arrays;
import java.util.Scanner;
public class DriverTwo {
    public static String convertUpercase(String str){
        String res = "";
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String firstLetter = arr[i].substring(0, 1).toUpperCase();
            String newString = firstLetter + arr[i].substring(1);
            res += (i == 0) ? newString : " "+newString;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        String res = convertUpercase(str);
        System.out.println(res);
    }
}
