package DsaGeekster.array;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={4,3,8,7,2,9,45,34,56,78,23,45,56};
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
