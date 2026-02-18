package 子串;

public class lc76 {
//    给定两个字符串 s 和 t，长度分别是 m 和 n，返回 s 中的 最短窗口 子串，
//    使得该子串包含 t 中的每一个字符（包括重复字符）。如果没有这样的子串，返回空字符串 ""。
//    测试用例保证答案唯一。
//
//    示例 1：
//    输入：s = "ADOBECODEBANC", t = "ABC"
//    输出："BANC"
//    解释：最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。

//    示例 2：
//    输入：s = "a", t = "a"
//    输出："a"
//    解释：整个字符串 s 是最小覆盖子串。

    public static String minWindow(String s, String t) {
        String res = "";


        return res;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = minWindow(s,t);
        System.out.println(res);
    }

}
