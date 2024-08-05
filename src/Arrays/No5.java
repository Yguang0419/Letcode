package Arrays;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数
 */
public class No5 {
    /**
     * 暴力破解
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int s =nums[nums.length-1];
        while (k>0) {
            //往有移动
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = s;
            s =nums[nums.length-1];
            k--;
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     *
     * @param
     */
    public void rotate1(int[] nums, int k) {
        int [] num1 = new int[nums.length];
        System.arraycopy(nums,0,num1,0,nums.length);
        int len =nums.length;
        int o=k%len;

        System.arraycopy(num1,0,nums,o,len-o);
//        System.out.println(Arrays.toString(nums));
        System.arraycopy(num1,len-o,nums,0,o);
//       System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(nums));
    }

    /**
     * * 三次反转
     * @param args
     */
    /**
     * 构建个空数组
     * @param args
     */
    public void rotate2(int[] nums, int k) {
        int [] num1 = new int[nums.length];
        int len =nums.length;
        int o=k%len;
        System.arraycopy(nums,0,num1,o,len-o);
        System.arraycopy(nums,len-o,num1,0,o);
        nums =num1;
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        No5 no5 = new No5();
        no5.rotate2(new int[]{1,2,3,4,5,6,7},3);
    }
}
