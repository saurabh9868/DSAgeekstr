package DsaGeekster.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MedianFinder {
    static PriorityQueue<Integer> minheap;
    static PriorityQueue<Integer> maxheap;

    public  MedianFinder() {
        minheap=new PriorityQueue<>((a,b)->(a-b));
        maxheap=new PriorityQueue<>((a,b)->(b-a));
    }

    public void addNum(int num) {
        if(maxheap.isEmpty() || maxheap.peek()>=num){
            maxheap.add(num);
        }
        else{
            minheap.add(num);
        }
        balance();
    }

    public double findMedian() {
        if(maxheap.size()>minheap.size()){
            return maxheap.peek();
        }
        else  if(maxheap.size()<minheap.size()){
            return minheap.peek();
        }
        else{
            return (double)(minheap.peek()+maxheap.peek())/2;
        }
    }
    public void balance(){
        if((minheap.size()-maxheap.size())>1){
            maxheap.add(minheap.poll());
        }
        else if((maxheap.size()-minheap.size())>1){
            minheap.add(maxheap.poll());
        }
    }

    public static void main(String[] args) {
        String s[]={"MedianFinder","addNum","addNum","findMedian","addNum","findMedian"};
        Integer arr[]={null,1, 2,null,3,null};
        Double output[]={null, null, null, 1.5, null, 2.0};

        /**
         * Your MedianFinder object will be instantiated and called as such:
         * MedianFinder obj = new MedianFinder();
         * obj.addNum(num);
         * double param_2 = obj.findMedian();
         */
    }
}
