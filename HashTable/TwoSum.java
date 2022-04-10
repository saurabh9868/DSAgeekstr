package DsaGeekster.HashTable;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference=target-nums[i];
            if(map.containsKey(difference)){
                return new int[] {map.get(difference),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int k=9;
        int arr1[]=twoSum(arr,k);
        System.out.println(Arrays.toString(arr1));
    }
}
