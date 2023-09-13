package misc;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println("If the strings "+str1+" "+str2+" are anagrams: "+checkAnagram(str1, str2));
    }

    public static boolean checkAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] charArray1=str1.toCharArray();
        Arrays.sort(charArray1);
        char[] charArray2=str2.toCharArray();
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
}
