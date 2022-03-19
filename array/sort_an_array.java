package DsaGeekster.array;

import java.util.Scanner;

public class sort_an_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int marks[]={6,21,13,41,15};
        for (int i=0;i< marks.length;i++){
            for (int j=i;j< marks.length-1;j++){
                int temp=0;
                if (marks[j]>marks[j+1]){
                    temp=marks[j+1];
                    marks[j+1]=marks[j];
                    marks[j]=temp;
                }
            }
        }
        System.out.println(marks[3]);
    }
}
