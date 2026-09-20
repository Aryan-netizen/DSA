class Solution {
    public int reverseDegree(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<26;i++){
            map.put((char)('a'+i),26-i);
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=(i+1)*(map.get(s.charAt(i)));
        }
        return ans;
    }
}