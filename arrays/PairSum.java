// package javaprojects.dsa.arrays;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] arr={1, -2, 1, 0, 5};
        int x=0;
        printArray(arr);
        //sort the array
        // for (int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        printArray(arr);
        int k=arr.length-1;
        int l=0;
        boolean flag=false;
        while(l<k){
            if(l==k){
                break;
            }
            if(arr[l]+arr[k]<x){
                l++;
            }else if(arr[l]+arr[k]>x){
                k--;
            }else{
                flag=true;
                System.out.println("Pair is "+arr[l]+" "+arr[k]);
                break;
            }
        }
        if(flag==false){
            System.out.println("Pair does not exist");
        }

        return;
    }
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
