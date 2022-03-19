package DsaGeekster.StacksAndQueueWeek14marchTo18march;

import java.util.Stack;

public class ReverseASentence {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        String s="saurabh is a good boy";
        String arr[]=s.split(" ");
        for(int i=0;i< arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
