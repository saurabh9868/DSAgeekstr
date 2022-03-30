package DsaGeekster.StacksAndQueueWeek14marchTo18march;

public class MyQueue {
    private ListNode front;
    private ListNode rear;
    private int size;
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=next;
        }
    }
    public MyQueue(){
        this.front=null;
        this.rear=null;
        front=rear;
        this.size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public void display(){
        if(front==null){
            System.out.println("queue is empty");
        }
        ListNode temp=front;
        while(temp!=rear){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+" ");
    }
    public void add(int data){
        ListNode newnode= new ListNode(data);
        if(isEmpty()){
            front=newnode;
            rear=newnode;
            size++;
        }
        else{
            rear.next=newnode;
            rear=rear.next;
            size++;
        }
    }
    public int remove(){
        int value;
        if(front==null){
            return 0;
        }
        if(front==rear && !isEmpty()){
             value= front.data;
            front=null;
            rear=null;

        }
        else {
             value= front.data;
            front=front.next;
            size--;
        }
        return value;
    }

    public  int peek(){
        if(front==null){
            return 0;
        }
        return front.data;
    }
    public static void main(String[] args) {
        MyQueue  q=new MyQueue();
        q.add(3);
        q.add(5);
        q.add(9);
        q.add(15);
        q.add(89);
        q.add(98);
        q.display();
        q.remove();
        System.out.println();
        q.display();
        System.out.println();
        System.out.println(q.peek());
    }
}
