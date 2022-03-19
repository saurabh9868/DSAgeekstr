package DsaGeekster.array;

public class March8th_Q1_reverseNumverRecursively {
    public static void reverse(int n,String s){
        if(n%10==0){
            System.out.println(s);
            return;
        }
        int a=n%10;
         s+= String.valueOf(a);
         n=n/10;
         reverse(n,s);

    }
    public static void main(String[] args) {
        int n=3456456;
        String s="";
        reverse(n,s);
    }
}
