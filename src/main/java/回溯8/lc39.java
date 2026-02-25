package 回溯8;

import java.util.ArrayList;
import java.util.List;

public class lc39 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result,
                           StringBuilder current,
                           int left,
                           int right,
                           int n) {

        // 终止条件：括号用完
        if (current.length() == 2 * n) {
            result.add(current.toString());
            return;
        }

        // 选择 1：加左括号
        if (left < n) {
            current.append('(');
            backtrack(result, current, left + 1, right, n);
            current.deleteCharAt(current.length() - 1); // 回溯
        }

        // 选择 2：加右括号
        if (right < left) {
            current.append(')');
            backtrack(result, current, left, right + 1, n);
            current.deleteCharAt(current.length() - 1); // 回溯
        }
    }

}
