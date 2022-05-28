class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hashMap = new int[26];

        for(int i=0; i<ransomNote.length(); i++){
            hashMap[ransomNote.charAt(i)-'a']++;
        }

        for(int i=0; i<magazine.length(); i++){
            hashMap[magazine.charAt(i)-'a']--;
        }

        for(int i=0; i<26; i++){
            if(hashMap[i]>0){
                return false;
            }
        }
        
        return true;
    }
}