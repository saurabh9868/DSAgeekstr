package DsaGeekster.array;

public class March8th_Q3_BinarySearchRecursively {
    public static void binarySearch(int arr[],int target,int low,int high){
        if(low>high){
            System.out.println("element is not present");
            return;
        }
        int mid=(low+high)/2;
        if(arr[mid]==target){
            System.out.println("element present at "+mid+" index");
            return;
        }
        else if(arr[mid]<target){
            binarySearch(arr,target,mid+1,high);
        }
        else if(arr[mid]>target){
            binarySearch(arr,target,low,mid-1);
        }

    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,18};
        int target=18;
        binarySearch(arr,target,0, arr.length-1);

    }
}
