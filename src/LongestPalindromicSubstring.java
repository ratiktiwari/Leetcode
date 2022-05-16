public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        int len = s.length();
        int[][] dp = new int[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }

        int max = 1;
        int start = 0;
        int end = 0;

        for (int i = 0, j = 1; i < len - 1 && j < len; i++, j++) {
            if (s.charAt(i) == s.charAt(j)) {
                dp[i][j] = 1;
                max = 2;
                start = i;
                end = j;
            } else {
                dp[i][j] = 0;
            }
        }

        for(int k=0; k<len-2; k++) {
            for (int i = 0, j = k+2; i < len-k+2 && j < len; i++, j++) {
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                    if (max < j - i + 1) {
                        max = j - i + 1;
                        start = i;
                        end = j;
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 1;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        

        String answer = s.substring(start, end+1);

        return answer;
    }

}
