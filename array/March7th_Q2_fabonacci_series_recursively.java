package DsaGeekster.array;

public class March7th_Q2_fabonacci_series_recursively {
    public static int fabonacci(int n){
        int result=0;
        if(n==0 || n==1){
            result=1;
        }
        else{
          result=fabonacci(n-1)+fabonacci(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(fabonacci(i)+" ,");
        }

    }
}
