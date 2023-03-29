package test;

import java.util.Arrays;

public class SecondHighestNumberArray {

    public static void main(String[] args){

        int[] arr= {1,3,6,10,4,5,7};
        int largest =0;
        int secLargest =0;
        Arrays.sort(arr);

        for(int i = arr.length-2;i>=0;i--){
            System.out.println(arr[arr.length-2]);
            if(arr[i]!= arr[arr.length -1]){

                System.out.println(arr[i]);
                return;
            }
        }


    }
}
