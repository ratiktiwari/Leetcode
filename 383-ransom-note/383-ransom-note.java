class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hashMap = new int[26];


        for (int i = 0; i < magazine.length(); i++) {
            hashMap[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--hashMap[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}