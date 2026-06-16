public class Solution2 {
    public static int suma(int n){
        if(n <=9)
            return n;
        int sum=0;
        while(n !=0){
            int aux= n%10;
            sum= sum + aux;
            n/=10;
        }
        return sum;
    }
    public static int problema(int sum){
        while(sum >9 )
            sum=suma(sum);
        return sum;
    }
    public static void main(String[] args){
        int n=12345;
        System.err.println(problema(n));
    }
}
