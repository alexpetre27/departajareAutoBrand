class Solution{
    public static boolean isDistinctive(int n){
        if( n <=9 )
            return true;
        String s = String.valueOf(n);
        for(int i=0; i < s.length(); ++i ){
            // System.err.println(s.charAt(i));
            for(int j=i+1; j <s.length(); ++j){
                //  System.err.println(s.charAt(j));
                 if( s.charAt(i) == s.charAt(j))
                      return false;
        }
           
        }
                 
        return true;
    }
    public static void main(String[] args){
        int n=12342;
        int b= 1223;
        int c = 9;
        System.out.println(isDistinctive(n));
         System.out.println(isDistinctive(b));
         System.out.println(isDistinctive(c));
    }
}