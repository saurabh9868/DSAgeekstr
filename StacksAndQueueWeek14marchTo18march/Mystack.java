package DsaGeekster.StacksAndQueueWeek14marchTo18march;

public class Mystack {
    private ListNode top;
    private int length;

    private class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Mystack(){
        this.top=null;
        this.length=0;
    }
    public int size(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        ListNode temp=new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }

        int data=top.data;
        top=top.next;
        length--;
        return data;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return top.data;
    }

    public static void main(String[] args) {
        Mystack stack=new Mystack();
        for(int i=0;i<10;i++){
            stack.push(i);
        }
        stack.push(25);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
