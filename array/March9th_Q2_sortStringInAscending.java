package DsaGeekster.array;

public class March9th_Q2_sortStringInAscending {
    public static  void string_in_aesc(int c[],int C[],int i, String s){
        if(i>=s.length()){
            return;
        }
        else{
            char ch=s.charAt(i);
            if((int)ch>96){
                c[ch-'a']++;
                i++;
                string_in_aesc(c,C,i,s);
            }
            else {
                C[ch-'A']++;
                i++;
                string_in_aesc(c,C,i,s);
            }
        }
    }
    public static void convert_to_string(int c[],int C[]){
        for (int i = 0; i<26; i++) {
            for (int j = 0; j < c[i]; j++) {
                System.out.print((char) (i + 'a'));
            }
            for (int j = 0; j < C[i]; j++) {
                System.out.print((char) (i + 'A'));
            }
        }
    }
    public static void main(String[] args) {
        String s="sauraWQqbhgargSAurAGHHGH";
        int c[]=new int[26];
        int C[]=new int[26];
        string_in_aesc(c,C,0,s);

        convert_to_string(c,C);

    }
}
