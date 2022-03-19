package DsaGeekster.StacksAndQueueWeek14marchTo18march;

import java.util.Stack;

public class CheckStringIsValidOrNot {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        String s="({[]})";
        boolean is_valid=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            }

            if(stack.isEmpty()){
                is_valid=false;
                break;
            }

            if(ch==']' && stack.peek()=='[' || ch=='}' && stack.peek()=='{' || ch==')' && stack.peek()=='('){
                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            is_valid=false;
        }
        System.out.println(is_valid);
    }
}
