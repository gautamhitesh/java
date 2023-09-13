package misc;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num+" fibo number: "+Fibo(num));
    }

    //1,1,2,3,5,8,13,21
    public static int Fibo(int num){
        if(num==0 || num==1){
            return num;
        }
        return Fibo(num-1)+Fibo(num-2);
    }
}
