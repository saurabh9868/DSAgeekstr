package DsaGeekster.array;

public class March8th_Q2_AverageOfArray {
    public static void average(int arr[],double result,int i){
        if(i==arr.length){
            System.out.println(result/ arr.length);
            return;
        }
        result+=arr[i];
        i++;
        average(arr,result,i);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        double result=0;
        average(arr,result,0);
    }
}
