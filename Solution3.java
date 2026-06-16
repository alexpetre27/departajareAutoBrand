class Solution3{
    public static String twoSum(int[] nums, int k){
        for(int i=0; i< nums.length; ++i){
            for(int j=i+1; j < nums.length;++j){
                if(nums[i] + nums[j] == k){
                    System.out.println(i + " " +j);
                    return " ";
                }
            }
        }
        return " ";
    }
    public static void main(String[] args){
        int[] n1={2,7,11,15};
        int[] n2={3,2,4};
        int[] n3={1,5,3,7};
        System.out.println(twoSum(n1,9));
        System.out.println(twoSum(n2,6));
        System.out.println(twoSum(n3,8));
    }
}