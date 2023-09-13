// package javaprojects.dsa.arrays;

import java.util.ArrayList;

class Arrayops {

    public static void main(String args[]) {
        System.out.println("Hello World");
        // int[] arr;
        // arr=new int[10];
        ArrayList arr=new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(i+1);
        }
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    
    }

    static void printArray(ArrayList arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }
        System.out.println();
    }

    static void reverseArray(ArrayList arr){
        int len=arr.size();
        for(int i=0;i<len/2;i++){
            int[] a=new int[1];
            int[] b=new int[1];
            a[0]=(int)arr.get(i);
            b[0]=(int)arr.get(len-1-i);
            swap(a,b);
        }
    }
    static void swap(int[] a, int[] b){
        int temp=a[0];
        a[0]=b[0];
        b[0]=temp;
        return;
    }

}