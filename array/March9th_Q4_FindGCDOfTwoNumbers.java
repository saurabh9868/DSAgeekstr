package DsaGeekster.array;

public class March9th_Q4_FindGCDOfTwoNumbers {
    public static void gcd(int divisor,int divident){
        if(divident%divisor==0){
            System.out.println(divisor);
            return;
        }
        gcd(divident%divisor,divisor);
       // return divisor;
    }
    public static void main(String[] args) {
        int a=4;
        int b=8;
        gcd(a,b);
    }
}
