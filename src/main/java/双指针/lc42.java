package 双指针;

import java.util.Stack;

public class lc42 {
    public static int trap(int[] height) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i<height.length;i++) {
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                if(height[i]<height[stack.peek()]){
                    stack.push(i);
                }else{
                    while(!stack.isEmpty()&&height[i]>height[stack.peek()]){
                        int mid = stack.pop();
                        if(stack.isEmpty()){
                            break;
                        }
                        int r = i;
                        int l = stack.peek();
                        int hei = Math.min(height[r],height[l])-height[mid];
                        int wid = r-l-1;
                        int sqr = hei * wid;
                        res = res+sqr;

                    }
                    stack.push(i);
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
//        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] nums = {4,2,0,3,2,5};
        int res = trap(nums);
        System.out.println(res);
    }

}
