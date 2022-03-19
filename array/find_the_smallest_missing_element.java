package DsaGeekster.array;

public class find_the_smallest_missing_element {
    public static int missing_num(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int num1[]={0, 1, 2, 6, 9, 11, 15};
        int num2[]={1, 2, 3, 4, 6, 9, 11, 15};
        int num3[]={0, 1, 2, 3, 4, 5, 6};
        System.out.println("the smallest missing number of array 1  "+missing_num(num1));
        System.out.println("the smallest missing number of array 2  "+missing_num(num2));
        System.out.println("the smallest missing number of array 3  "+missing_num(num3));

    }
}
