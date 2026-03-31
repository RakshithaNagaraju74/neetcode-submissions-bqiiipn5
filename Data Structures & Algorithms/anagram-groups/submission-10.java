class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> res = new HashMap<>();
       for(String str:strs){
        char[] charS= str.toCharArray();
        Arrays.sort(charS);
        String sortedS=new String(charS);
        res.putIfAbsent(sortedS,new ArrayList<>());
        res.get(sortedS).add(str);
       }
       return new ArrayList<>(res.values());
    }
}
