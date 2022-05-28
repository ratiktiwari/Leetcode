public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        int[] hashMap = new int[26];

        for(int i=0; i<s.length(); i++){
            hashMap[s.charAt(i)-'a']++;
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
