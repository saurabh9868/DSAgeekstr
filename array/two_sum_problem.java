package DsaGeekster.array;

public class two_sum_problem {
    public static void target_find(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]==target){
                System.out.println("target is sum of these two elements present at "+low+" and "+high+" position");
            }
            if(arr[low]+arr[high]<target){
                low++;
            }
            else{
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        target_find(arr,target);
        int arr1[]={5,4,6,7,8,9,10};
        int target2=18;
        target_find(arr1,target2);
    }
}
