class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res= new HashMap<>();
        for(String s:strs){
            char[] sChar=s.toCharArray();
            Arrays.sort(sChar);
            String sortedS= new String(sChar);
            res.putIfAbsent(sortedS,new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
