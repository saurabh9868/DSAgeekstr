package DsaGeekster.StacksAndQueueWeek14marchTo18march;

import java.util.Stack;

public class UsingTwoStacksImplementAQueue {
    private  Stack stack1;
    private  Stack stack2;
    private int size;
    public UsingTwoStacksImplementAQueue(){
        this.stack1=new Stack<Integer>();
        this.stack2=new Stack<Integer>();
        this.size=0;
    }

    public int size(){
        return size;
    }

    public void add(int a){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(a);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        size++;
    }
    public int poll(){
        int a= (int) stack1.pop();
        return a;
    }
    public int peek(){
        int a=(int)stack1.peek();
        return a;
    }
    public static void main(String[] args) {
        UsingTwoStacksImplementAQueue queue=new UsingTwoStacksImplementAQueue();
        for (int i=0;i<10;i++){
            queue.add(i);
        }
        System.out.println(queue.peek());
        System.out.println(queue.poll());

    }
}
