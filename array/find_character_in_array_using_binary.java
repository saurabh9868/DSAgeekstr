package DsaGeekster.array;

import java.util.Arrays;

public class find_character_in_array_using_binary {
    public static int search_char(char arr[],char target){
        int value=(int)target;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((int)arr[mid]==value){
                return mid;
            }
            else if((int)arr[mid]<value){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        char arr[]={'a','b','d','e','f','g','h','i','x','z'};
        char target='d';
        int pos=search_char(arr,target);
        System.out.println(pos);
        System.out.println(Arrays.toString(arr));
    }
}
