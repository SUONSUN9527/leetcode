package 回溯8;

public class lc79 {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // 1. 边界检查
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }

        // 2. 字符不匹配
        if (board[i][j] != word.charAt(index)) {
            return false;
        }

        // 3. 成功匹配到最后一个字符
        if (index == word.length() - 1) {
            return true;
        }

        // 4. 标记已访问
        char temp = board[i][j];
        board[i][j] = '#';

        // 5. 四个方向 DFS
        boolean found =
                dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1);

        // 6. 回溯（恢复现场）
        board[i][j] = temp;

        return found;
    }

}
