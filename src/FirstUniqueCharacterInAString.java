import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        int[] hashMap = new int[26];
        int index = 0;
        int unique = 0;

        for(int i=0; i<s.length(); i++){
            index = ((int) s.charAt(i))%97;
            hashMap[index]++;
        }

        for(int i=0; i<s.length(); i++){
            index = ((int) s.charAt(i))%97;
            if(hashMap[index]==1){
                return i;
            }
        }

        return -1;
    }

}
