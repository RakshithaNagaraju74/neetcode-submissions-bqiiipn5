public class Solution {
    public int longestConsecutive(int[] nums) {
       int res=0;
       Set<Integer> count = new HashSet<>();
       for(int n:nums){
        count.add(n);
       }
       for(int n:nums){
        int streak=0,cur=n;
        while(count.contains(cur)){
            streak++;
            cur++;
        }
        res=Math.max(res,streak);
       }
       return res;
    }
}