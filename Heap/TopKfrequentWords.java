package DsaGeekster.Heap;

import java.util.*;

public class TopKfrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else{
                map.put(words[i],1);
            }
        }

        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<Map.Entry<String, Integer>>((a, b)->{
            if(a.getValue()!= b.getValue()){
                return -1*(a.getValue()- b.getValue());
            }
            else{
                return a.getKey().compareTo(b.getKey());
            }
        });

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            pq.add(entry);
        }

        List<String> lists=new ArrayList<String>();
        while(lists.size()<k){
            Map.Entry<String,Integer> entry=pq.poll();
            lists.add(entry.getKey());
        }

        return lists;
    }
    public static void main(String[] args) {
        String[] a={"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k=4;
        System.out.println(topKFrequent(a,k));
    }
}
