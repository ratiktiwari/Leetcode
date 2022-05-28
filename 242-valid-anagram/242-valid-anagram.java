class Solution {
    public boolean isAnagram(String s, String t) {
        int[] hashMap = new int[26];

        for(int i=0; i<s.length(); i++){
            hashMap[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            hashMap[t.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(hashMap[i]!=0){
                return false;
            }
        }

        return true;
    }
}