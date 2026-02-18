package 滑动窗口;

import java.util.HashSet;
import java.util.Set;

public class lc3 {
//    给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
//
//    示例 1:
//    输入: s = "abcabcbb"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。注意 "bca" 和 "cab" 也是正确答案。
//
//    示例 2:
//    输入: s = "bbbbb"
//    输出: 1
//    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//
//    示例 3:
//    输入: s = "pwwkew"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//    请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

    public static int lengthOfLongestSubstring(String s) {
        int res = 1;
        if(s.isEmpty()) {
            return 0;
        }
        char[] s1 = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int left = 0;left<s1.length-1;left++){
            set.add(s1[left]);
            int right = left+1;
            int curr = 1;
            while(right<s1.length && !set.contains(s1[right])){
                set.add(s1[right]);
                curr = curr +1;
                right ++;
            }
            res = Math.max(curr,res);
            set.clear();
        }
        return res;
    }

    public static void main(String[] args) {
//        String s = "abcabcbb";
        String s = "pwwkew";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }

}
