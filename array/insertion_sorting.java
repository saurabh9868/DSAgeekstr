package DsaGeekster.array;

import java.util.Arrays;

public class insertion_sorting {
    public static void main(String[] args) {
        int arr[]={4,3,7,8,2,9,45,34,56,78,23,45,56};
        for(int i=0;i< arr.length;i++){
            int element=arr[i];
            int j=i-1;  //3  2 1 0
            while(j>=0 && arr[j]>element){
                    arr[j+1]=arr[j];
                    j--;
            }
            arr[j+1]=element;
        }
        System.out.println(Arrays.toString(arr));
    }
}
