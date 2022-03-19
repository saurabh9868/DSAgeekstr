package DsaGeekster.array;

import java.util.Arrays;

public class find_minimum_in_rotated_array {
    public static int search(int arr[]){
        int min=Integer.MAX_VALUE;
        int pos=-1;
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                pos=i;
            }
        }
        return pos;
    }

    public static  void reverse(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};               //  5,4,3
        int k= arr.length-search(arr);

        reverse(arr,0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr,0, arr.length-1);

        System.out.println(k+" times rotation we have to do");
        System.out.println("and our original given below");
        System.out.println(Arrays.toString(arr));

    }
}
