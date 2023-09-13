package misc;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        // int size=10;
        int[] arr={42, 17, 42, 85 ,89, 57, 57, 90, 23, 10};
        // arr=initializeArray(size);
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
        System.out.println(binarySearch(arr, 0, arr.length-1,91));

    }
    public static int[] initializeArray(int size){
        Random rand=new Random();
        int[] arr= new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rand.nextInt(100);
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static boolean binarySearch(int[] arr, int l, int r,int x){
        int mid=(int)(r+l)/2;
        if(l>r){
            return false;
        }
        if(x==arr[mid]){
            System.out.println("Found at position "+mid);
            return true;
        }
        if(x<arr[mid]){
            return binarySearch(arr, l, mid-1,x);
        }
        return binarySearch(arr, mid+1, r,x);
    }
}
