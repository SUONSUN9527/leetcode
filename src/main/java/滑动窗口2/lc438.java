package 滑动窗口2;

import java.util.*;

public class lc438 {

//    给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
//
//    示例 1:
//    输入: s = "cbaebabacd", p = "abc"
//    输出: [0,6]
//    解释:
//    起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
//    起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;
        int[] pLen = new int[26];
        int[] sLen = new int[26];
        char[] s1 = s.toCharArray();
        char[] p1 = p.toCharArray();
        for(char c:p1){
            pLen[c-'a']++;
        }
        for(int i = 0;i<p1.length;i++){
            sLen[s1[i]-'a']++;
        }
        if(Arrays.equals(pLen,sLen)){
            res.add(0);
        }
        for(int i =p.length();i<s1.length;i++){
            sLen[s1[i]-'a']++;
            sLen[s1[i-p1.length]-'a']--;
            if(Arrays.equals(pLen,sLen)){
                res.add(i-p1.length+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "cbaebabacd";
        String s2 = "abc";
        List<Integer> res = findAnagrams(s1,s2);
        System.out.println(res);
    }

}
