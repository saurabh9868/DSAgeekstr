package DsaGeekster.array;

public class March7th_Q4_factorial_recursively {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return fact(n-1)*n;
        }
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(fact(n));
    }
}
