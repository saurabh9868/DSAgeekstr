package DsaGeekster.linkedList;

public  class LinkedList {
    private ListNode head;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public LinkedList(){
        this.length=0;
        this.head=null;
    }

    public boolean isEmpty(){
        return length==0;
    }
    public int size(){
        return length;
    }
//-------------------------------------------------------------------------------------------------
    public void insert(int data){
       ListNode temp=new ListNode(data);
       if(head==null){
           head=temp;
           length++;
           return;
       }
       ListNode current=head;
       while(current.next!=null){
           current=current.next;
       }
       current.next=temp;
       length++;
    }
    public void display(){
        if(head==null){
            System.out.println("linked list is empty");
        }
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }
//---------------------------------------------------------------------------------------------------
    public void insertAtGivenPosition(int data,int idx){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
        }
        ListNode previous=null;
        ListNode current=head;
        int i=1;
        while (current!=null && i<idx){
            previous=current;
            current=current.next;
            i++;
        }
        previous.next=newNode;
        newNode.next=current;
        length++;
    }
//------------------------------------------------------------------------------------------------
    public int delete(int idx){
        if(head==null){
            System.out.println("linked list is empty");
        }
        if(idx>size()){
            System.out.println("index out of bound");
        }
        ListNode current=head;
        ListNode previous=null;
        int i=1;
        while(current!=null && i<idx){
            previous=current;
            current=current.next;
            i++;
        }

        ListNode next=current.next;
        int data=current.data;
        current.next=null;
        previous.next=next;
        length--;
        return data;
    }
    //---------------------------------------------------------------------------------------------
    public int searchElementIndex(int data){
        if(head==null){
            System.out.println("linked list is empty");
        }
        ListNode current=head;
        int i=1;
        while(current!=null){
            if(current.data==data){
                return i;
            }
            current=current.next;
            i++;
        }
        return -1;
    }
    //-------------------------------------------------------------------------------------------------
    public void printListFromAGivenIndex(int idx){
        if(idx>size()){
            System.out.println("index out of bounds");
        }
        int i=0;
        ListNode current=head;
        while(current!=null && i<idx){
            current=current.next;
            i++;
        }
        ListNode temp=current;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
//-------------------------------------------------------------------------------------------------------
    public int KthElementFromEndTwoPtr(int idx){
        if(idx>size()){
            System.out.println("index out of bounds");
        }
        ListNode current=head;
        ListNode kth=head;
        int i=1;
        while(current!=null && i<idx){
            current=current.next;
            i++;
        }
        while(current.next!=null){
            current=current.next;
            kth=kth.next;
        }
        return kth.data;
    }
//----------------------------------------------------------------------------------------------------
    public int KthElementFromEnd(int idx){
        if(idx>size()){
            System.out.println("index out of bounds");
        }
        ListNode current=head;
        int k=(size()-idx)+1;
        int i=1;
        while(current.next!=null && i<k){
            current=current.next;
            i++;
        }
        ListNode temp=current;
        return temp.data;
    }
//-----------------------------------------------------------------------------------------------------------
    public static int getIntersectionNode(ListNode headA, ListNode headB) {
        int countA=0;
        ListNode currentA=headA;
        while(currentA!=null){
            currentA=currentA.next;
            countA++;
        }
        int countB=0;
        ListNode currentB=headB;
        while(currentB!=null){
            currentB=currentB.next;
            countB++;
        }
        if(countB>countA){
            for(int i=0;i<(countB-countA) && headB!=null;i++){
                headB=headB.next;
            }
        }
        else{
            for(int j=0;j<(countA-countB) && headA!=null;j++){
                headA=headA.next;
            }
        }
        while(headA!=null && headB!=null && headA.data!=headB.data){
            headA=headA.next;
            headB=headB.next;
        }
        return headA.data;
    }

//------------------------------------------------------------------------------------------------------------
    public void removeduplicates(){
        if(head==null){
            return;
        }
        ListNode current=head;

        while(current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else {
                current = current.next;
            }
        }
    }

 //---------------------------------------------------------------------------------------------------------------
    public ListNode mergelinkedList(ListNode headA, ListNode headB){
        ListNode dummy=new ListNode(0);
        ListNode headC=dummy;
        ListNode currentA=headA;
        ListNode currentB=headB;
        while (currentA!=null && currentB!=null){
            if(currentA.data<=currentB.data){
                dummy.next=currentA;
                currentA=currentA.next;
            }
            else if(currentB.data<=currentA.data){
                dummy.next=currentB;
                currentB=currentB.next;
            }
            dummy=dummy.next;
        }
        if(currentB==null){
            dummy.next=currentA;
        }
        if(currentA==null){
            dummy.next=currentB;
        }
        return headC.next;
    }
    //------------------------------------------------------------------------------------------------------
    public ListNode mergeKLists(ListNode[] lists) {
        int interval=1;
        int len=lists.length;
        if(len==0){
            return null;
        }
        while(interval<len){
            for(int i=0;i<len-interval;i+=interval*2){
                merge(lists,i,i+interval);
            }
            interval*=2;
        }
        return lists[0];
    }

    public void merge(ListNode[] lists ,int index1 ,int index2){
        ListNode l1=lists[index1];
        ListNode l2=lists[index2];
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null){
            temp.next=l1;
        }
        else{
            temp.next=l2;
        }
        lists[index1]=dummy.next;
    }
//-------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        LinkedList sll=new LinkedList();
        sll.insert(5);
        sll.insert(10);
        sll.insert(15);
        sll.insert(30);
        sll.insert(18);
        sll.insert(25);
        sll.display();
        System.out.println();
        LinkedList sll2=new LinkedList();
        sll2.insert(34);
        sll2.insert(66);
        sll2.insert(51);
        sll2.insert(17);
        sll2.insert(31);
        sll2.insert(30);
        sll2.insert(18);
        sll2.insert(25);

        sll2.display();
        System.out.println();
        System.out.println(getIntersectionNode(sll.head,sll2.head));

        LinkedList sll3=new LinkedList();
        sll3.insert(2);
        sll3.insert(2);
        sll3.insert(3);
        sll3.insert(4);
        sll3.insert(4);
        sll3.insert(4);
        sll3.insert(5);
        sll3.display();
        System.out.println();
        sll3.removeduplicates();
        sll3.display();
    }

}
