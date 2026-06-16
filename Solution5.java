import java.util.*;

public class Solution5 {
    public static String freqChar(String s){
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(char c : s.toCharArray())
        //     map.put(c,map.getOrDefault(c, 0)+1);
        StringBuilder sb= new StringBuilder();
        int k=0;
        for(int i=0; i <= s.length(); ++i)
            for(int j=i+1; j<=s.length(); ++j){
                if(s.charAt(i) == s.charAt(j)){
                    sb.append(s.charAt(i));
                    k++;
                }
            }
        
    }

    public static void main(String[] args) {
        String[] s= {"aabbcdeb" , "aabb","abc","a"};
        System.out.println(freqChar(s[0]));
        System.out.println(freqChar(s[1]));
        System.out.println(freqChar(s[2]));
        System.out.println(freqChar(s[3]));
    
    }
}
