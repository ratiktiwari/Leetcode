public class LongestPalindromicSubstring {

//    public String longestPalindrome(String s) {
//
//        int len = s.length();
//        int[][] dp = new int[len][len];
//
//        for (int i = 0; i < len; i++) {
//            dp[i][i] = 1;
//        }
//
//        int max = 1;
//        int start = 0;
//        int end = 0;
//
//        for (int i = 0, j = 1; i < len - 1 && j < len; i++, j++) {
//            if (s.charAt(i) == s.charAt(j)) {
//                dp[i][j] = 1;
//                max = 2;
//                start = i;
//                end = j;
//            } else {
//                dp[i][j] = 0;
//            }
//        }
//
//        for(int k=0; k<len-2; k++) {
//            for (int i = 0, j = k+2; i < len-k+2 && j < len; i++, j++) {
//                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
//                    if (max < j - i + 1) {
//                        max = j - i + 1;
//                        start = i;
//                        end = j;
//                        dp[i][j] = 1;
//                    } else {
//                        dp[i][j] = 1;
//                    }
//                } else {
//                    dp[i][j] = 0;
//                }
//            }
//        }
//
//
//
//        String answer = s.substring(start, end+1);
//
//        return answer;
//    }




    public String longestPalindrome(String s) {//babad
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);//for odd search
            String s2 = palindrome(s, i, i + 1);//for even search

            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    public String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length()
                && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
