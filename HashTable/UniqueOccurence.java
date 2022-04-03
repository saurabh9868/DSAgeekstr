package DsaGeekster.HashTable;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurence {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        HashSet<Integer> set=new HashSet<>(map.values());
        if(set.size()==map.size()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
