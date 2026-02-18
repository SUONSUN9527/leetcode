package 双指针;

public class lc11 {

//    给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
//
//    找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
//    返回容器可以储存的最大水量。
    public static int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int res = 0;
//        for(int fast = 0;fast<height.length;fast++){
//            int slow = fast+1;
//            int wid = 1;
//            while(slow<height.length){
//                int h = Math.min(height[slow], height[fast]);
//                int sqr = wid * h;
//                res = Math.max(res,sqr);
//                wid++;
//                slow++;
//            }
//        }
//        时间复杂度太高了
        int l = 0;
        int r = height.length-1;
        while(l<r){
            res = Math.max(res, Math.min(height[l],height[r])*(r-l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {1,8,6,2,5,4,8,3,7};
//        int[] num = {1,1};
        int res = maxArea(num);
        System.out.println(res);
    }


}
