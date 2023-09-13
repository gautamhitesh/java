package misc;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Number " + x + " as a sum of prime: "+sumOfPrime(x));
    }

    public static boolean sumOfPrime(int num) {
        if(num<=2){
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (checkPrime(i)) {
                if (checkPrime(num - i)) {
                    // System.out.println((num - i) + "+" + i);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkPrime(int num) {
        if(num<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt((double) num); i++) {
            // System.out.println(num%i);
            if (num % i == 0) {
                // System.out.println(num+" not a prime");
                return false;
            }
        }
        // System.out.println(num+" is a prime");
        return true;
    }
}
