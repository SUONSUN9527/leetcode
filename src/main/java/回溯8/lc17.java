package 回溯8;

import java.util.ArrayList;
import java.util.List;

public class lc17 {

    // 数字到字母的映射，下标就是数字
    private static final String[] MAP = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        // 边界条件
        if (digits == null || digits.length() == 0) {
            return res;
        }

        backtrack(digits, 0, new StringBuilder());
        return res;
    }

    /**
     * @param digits 原始数字字符串
     * @param index  当前处理到第几位数字
     * @param path   当前已经拼好的字母路径
     */
    private void backtrack(String digits, int index, StringBuilder path) {

        // ✅ 结束条件：路径长度等于数字长度
        if (index == digits.length()) {
            res.add(path.toString());
            return;
        }

        // 当前数字
        char digit = digits.charAt(index);
        String letters = MAP[digit - '0'];

        // 遍历当前数字能选的所有字母
        for (char c : letters.toCharArray()) {

            // 1️⃣ 选择
            path.append(c);

            // 2️⃣ 递归，处理下一个数字
            backtrack(digits, index + 1, path);

            // 3️⃣ 撤销选择（回溯的灵魂）
            path.deleteCharAt(path.length() - 1);
        }
    }

}
