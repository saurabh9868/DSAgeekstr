package DsaGeekster.Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKfrequentElements {
    public static void reverse(int arr1[],int arr2[]){
        for(int i=0;i<arr1.length;i++){
            int temp=arr1[i];
            int temp1=arr2[i];
            int j=i-1;
            while(j>=0 && arr1[j]<temp){
                arr1[j+1]=arr1[j];
                arr2[j+1]=arr2[j];
                j--;
            }
            arr1[j+1]=temp;
            arr2[j+1]=temp1;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,-1,2,-1,2,3};

        Arrays.sort(arr);
        int k=2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int count=1;
            while(i< arr.length-1 && arr[i+1]==arr[i]){
                count++;
                i++;
            }
            map.put(arr[i],count);
        }
        int arr1[]=new int[map.size()];
        int arr2[]=new int[map.size()];
        int i=0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            arr1[i]=entry.getValue();
            arr2[i]=entry.getKey();
            i++;
        }
        reverse(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for(int j=0;j< k;j++){
            System.out.println(arr2[j]);
        }
    }
}
