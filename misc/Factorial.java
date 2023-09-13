package misc;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of the number: "+Factorial(5));
        System.out.println("Magic 163:"+magicNumber(163));
    }

    public static int Factorial(int num){
        if(num==1){
            return 1;
        }else{
            return num*Factorial(num-1);
        }
    }

    public static boolean magicNumber(int num){
        //sum of the digits is 1
        int sum=sumOfDigits(num);
        while(sum>=9){
            sum=sumOfDigits(sum);
        }
        if(sum==1){
            return true;
        }else{
            return false;
        }
    }

    public static int sumOfDigits(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+sumOfDigits(num/10);
    }
}
