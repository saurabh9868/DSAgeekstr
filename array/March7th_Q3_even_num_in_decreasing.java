package DsaGeekster.array;

public class March7th_Q3_even_num_in_decreasing {
    public static void even_dec(int n){
        if(n==0){
            return;
        }
        if(n%2==0){
            System.out.print(n+" ");
        }
        n--;
        even_dec(n);
    }
    public static void main(String[] args) {
        int n=76;
        even_dec(n);
    }
}
