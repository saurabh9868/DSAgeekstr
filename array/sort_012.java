package DsaGeekster.array;

import java.util.Arrays;

public class sort_012 {
    public static void main(String[] args) {
        int a[]={0,0,2,0,1,2,0,1,2};
        int end=a.length-1;
        int start=0;
        int i=0;
        while(i<=end){
            switch (a[i]){
                case 0:
                    int temp=a[i];
                    a[i]=a[start];
                    a[start]=temp;
                    start++;
                    i++;
                    break;

                case 1:
                    i++;
                    break;
                case 2:
                    temp=a[i];
                    a[i]=a[end];
                    a[end]=temp;
                    i++;
                    end--;
                    break;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
