package DsaGeekster.array;

public class frequency_of_elem_in_array {
    public static int frequency_count(int arr[],int target, boolean bound){
        int low=0;
        int result=-1;
        int high=arr.length-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                if(bound==true){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,4,5,5,6,6,6,6,9,10,11};
        int target=6;
        int upperbound=frequency_count(arr,target,true);
        int lower_bound=frequency_count(arr,target,false);
        int freq=lower_bound-upperbound+1;
        System.out.println(freq);

    }
}
