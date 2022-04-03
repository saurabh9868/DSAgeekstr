package DsaGeekster.Heap;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> stack=new Stack<>();
        int nge[]=new int[nums.length];
        stack.push(nums.length-1);
        nge[nge.length-1]=nums.length;
        for(int i=nums.length-2;i>=0;i--){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nge[i]=nums.length;
            }
            else{
                nge[i]=stack.peek();
            }
            stack.push(i);
        }
        int arr[]=new int[nums.length-k+1];

        int j=0;
        for(int i=0;i<=nums.length-k;i++){
            if(j<i){
                j=i;
            }
            while(nge[j]<i+k){
                j=nge[j];
            }

            arr[i]=nums[j];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int arr1[]=maxSlidingWindow(arr,k);
        System.out.println(Arrays.toString(arr1));
    }
}
