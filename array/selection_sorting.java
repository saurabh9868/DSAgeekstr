package DsaGeekster.array;

import java.util.Arrays;

public class selection_sorting {
    public static void main(String[] args) {
        int arr[]={4,3,8,7,2,9,45,34,56,78,23,45,56};
        for(int i=0;i< arr.length;i++){
            int min=i;
            for(int j=i;j< arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
