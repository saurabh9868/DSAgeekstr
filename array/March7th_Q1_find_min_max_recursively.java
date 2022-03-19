package DsaGeekster.array;

public class March7th_Q1_find_min_max_recursively {
    public static void find_min_max(int arr[],int n,int min,int max){
        if(n==arr.length){
            System.out.println(min);
            System.out.println(max);
            return;
        }
        if(arr[n]<min){
            min=arr[n];
        }
        if(arr[n]>max){
            max=arr[n];
        }
        n++;
        find_min_max(arr,n,min,max);

    }
    public static void main(String[] args) {
        int arr[]={1,-1,0,2,-2,3,-3,4,-4};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        find_min_max(arr,0,min, max);
    }
}
