import java.util.*;

public class Solution4 {
    public static Character uniqueChar(String s){
        HashMap<Character,Integer> map= new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c, 0)+1);
        for(char c: s.toCharArray()){
            if(map.get(c) == 1)
                return c;
        }
        return null;
    }
    public static void main(String[] args) {
        String[] s= {"aabbcde" , "aabb"};
        System.out.println(uniqueChar(s[0]));
        System.out.println(uniqueChar(s[1]));
    }
}
