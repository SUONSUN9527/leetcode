package 回溯8;

import java.util.ArrayList;
import java.util.List;

public class lc131 {

    private List<List<String>> res = new ArrayList<>();
    private List<String> path = new ArrayList<>();
    private boolean[][] dp;

    public List<List<String>> partition(String s) {
        int n = s.length();
        dp = new boolean[n][n];

        // 1️⃣ 预处理回文 DP
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                    }
                }
            }
        }

        // 2️⃣ 回溯搜索
        backtrack(s, 0);
        return res;
    }

    private void backtrack(String s, int start) {
        // 走到字符串末尾，说明是一个完整方案
        if (start == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }

        // 枚举切割点
        for (int end = start; end < s.length(); end++) {
            if (!dp[start][end]) continue;

            path.add(s.substring(start, end + 1));
            backtrack(s, end + 1);
            path.remove(path.size() - 1);
        }
    }


}
