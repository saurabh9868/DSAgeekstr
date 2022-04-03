package DsaGeekster.HashTable;

import java.util.HashMap;

public class jewels_and_stone {
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<stones.length();i++){
            Character ch=stones.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        int sum=0;
        for(int i=0;i<jewels.length();i++){
            Character ch=jewels.charAt(i);
            if(map.containsKey(ch)){
                sum+=map.get(ch);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
