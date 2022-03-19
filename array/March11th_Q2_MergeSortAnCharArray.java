package DsaGeekster.array;

import java.util.Arrays;

public class March11th_Q2_MergeSortAnCharArray {
    public static void mergeSort(char arr[],char temp[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr,temp,low,mid);
            mergeSort(arr,temp,mid+1,high);
            merge(arr, temp,low,mid,high);
        }
    }
    public static void merge(char arr[],char temp[],int low,int mid,int high){
        for(int i=low;i<=high;i++){
            temp[i]=arr[i];
        }
        int i=low;
        int j=mid +1;
        int k=low;
        while(i<=mid && j<=high){
            if(temp[i]>temp[j]){
                arr[k]=temp[i];
                i++;
                k++;
            }
            else{
                arr[k]=temp[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            arr[k]=temp[i];
            i++;
            k++;
        }
        while (j<=high){
            arr[k]=temp[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        char  arr[] = {'a','x','y','b','A','T','t'};  //  [97, 120, 121, 98, 65, 84, 116]  [121, 120, 116, 98, 97, 84, 65]
        char temp[]=new char[arr.length];
        int low=0;
        int high= arr.length-1;

        mergeSort(arr,temp,low,high);
        System.out.println(Arrays.toString(arr));

    }
}
