import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Lakshay";
        System.out.println(reverseString(str));
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
    }
    public static String reverseString(String str){
        StringBuilder reversedStr = new StringBuilder();
        for(int i = str.length() - 1; i>=0 ;i--){
            reversedStr.append(str.charAt(i));
        }
        return reversedStr.toString();
    }
}