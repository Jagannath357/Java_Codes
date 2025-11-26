import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DriverFive {
    // public static boolean replace(StringBuilder sb, String replace, int i){
    //     System.out.println(sb.substring(i, i + replace.length()).equals(replace));
    //     if(sb.substring(i, i+replace.length()).equals(replace)){
    //         for(int j = i, k = 0; j < i+replace.length() && k < replace.length(); j++, k++){
    //             sb.append(replace.charAt(k));
    //         }
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
    // public static String replaceString(String str, String replace){
    //     int m = str.length();
    //     int n = replace.length();
    //     if (str.indexOf(replace) == -1) {
    //         return str;
    //     }
    //     StringBuilder sb = new StringBuilder(str);
    //     boolean b = true;
    //     int i = 0;
    //     while(b) {
    //         if (i == sb.length()) {
    //             b = false;
    //             break;
    //         }
    //         if (sb.charAt(i) == replace.charAt(0)) {
    //             replace(sb, replace, i);
    //             i += n;
    //             continue;
    //         }
    //         i++;
    //     }
    //     System.out.println(sb.toString());
    //     return sb.toString();
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original String :");
        String str = sc.nextLine();

        System.out.println("Enter the Substring :");
        String sub = sc.nextLine();

        System.out.println("Enter the String to replace :");
        String replace = sc.nextLine();

        System.out.println("Original String : "+str);
        //String newString = str.replaceAll("*a*", "ok");
        String newString = str.replaceAll(sub, replace);
        System.out.println("Replaced String : "+newString);
        //System.out.println(replaceString(str, , "OO"));
    }
}
