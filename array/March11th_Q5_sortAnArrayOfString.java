package DsaGeekster.array;

import java.util.Arrays;

public class March11th_Q5_sortAnArrayOfString {
    public static  String string_in_aesc(int c[], String s){
        String s1="";
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           c[ch-'a']++;
       }
       for(int i=0;i<26;i++){
           for(int j=0;j<c[i];j++){
               s1+=(char)(i+'a');
           }
       }
       for (int i=0;i<26;i++){
           c[i]=0;
       }
       return s1;
    }


    public static void main(String[] args) {
        String arr[]={"gfi","lui","trs","plt"};
        int c[]=new int[26];
        for(int i=0;i< arr.length;i++){
              String s=arr[i];
              arr[i]=string_in_aesc(c,s);
        }
        System.out.println(Arrays.toString(arr));
    }
}
