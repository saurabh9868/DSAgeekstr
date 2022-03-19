package DsaGeekster.array;

import java.util.Arrays;

public class March9th_Q1_SortAString {
    public static  void string_in_desc(int c[],int i, String s){
        if(i>=s.length()){
            return;
        }
        else{
            char ch=s.charAt(i);
            c[ch-'a']++;
            i++;
            string_in_desc(c,i,s);
        }
    }
    public static void convert_to_string(int c[]){
        for (int i = 25; i >=0; i--) {
            for (int j = 0; j < c[i]; j++) {
                System.out.print((char) (i + 'a'));
            }
        }

    }
    public static void main(String[] args) {
        String s="saurabhgarg";
        int c[]=new int[26];
        string_in_desc(c,0,s);
        System.out.println(Arrays.toString(c));
        convert_to_string(c);

    }
}
