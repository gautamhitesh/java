package misc;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        s.close();
        System.out.println("Input string is "+str);
        String str2=reverseString(str);
        System.out.println("Reversed string "+str2);
        System.out.println("Is string "+str+" a palindrome: "+isPalindrome(str2));
    }

    public static boolean isPalindrome(String str){
        String str2=reverseString(str);
        if(str2.equals(str)){
            return true;
        }
        return false;
    }

    //via recursion
    public static String reverseString(String str){
        if(str==null||str.isEmpty()){
            return str;
        }
        return str.charAt(str.length()-1)+reverseString(str.substring(0, str.length()-1));
    }
}
