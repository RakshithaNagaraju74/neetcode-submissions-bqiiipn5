class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] num=new int[2*n];
        for(int i=0;i<2*n;i++){
            num[i]=nums[i%n];
        }
        return num;
    }
}