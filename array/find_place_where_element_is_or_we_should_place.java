package DsaGeekster.array;

public class find_place_where_element_is_or_we_should_place {
    public static int find_place(int arr[],int target){
        int i=0;
        while(i<arr.length){
            if(arr[i]==target){
                return i;
            }
            else if(arr[i]>target){
                return i;
            }
            else{
                i++;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target=2;
        System.out.println(find_place(arr,target));
    }
}
