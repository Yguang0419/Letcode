package Arrays;

import java.util.Arrays;

public class No4 {
//    暴力破解
    public int majorityElement(int[] nums) {
        int count=0;
        int slow=0;
        int fast=0;
        int len =nums.length;
        while (fast<len) {
            if (nums[fast] == nums[slow]) {
                count++;
            }
//            遍历到最后一个也没满足条件，那么这个元素就跳过
            if (count <= len / 2 && fast == len-1)  {
                slow++;
                fast=slow;
                count=0;
            } else {
                fast++;
            }

        }
//        System.out.println("重复最多的元素："+);
        return nums[slow];
    }

    /** 《摩尔投票算法》
     * 核心思想：对方的票和自己的票抵消，最后剩下的就是重复最多的元素
     * @param nums
     * @return
     */
    public int majorityElement1(int[] nums) {
        int candicate =0;
        int votes =0;
        for(int num:nums){
            //如果为0，则代表中立状态，可以更换候选人
            if(votes==0){
                candicate=num;
            }
            //如果不相等，则票数要抵消掉
            if(num!=candicate){
                votes--;
            }else {
                votes++;
            }

        }
        return candicate;
    }
/**
 * 思路三：既然元素超过了n/2，那么排序取个弟n/2的就行了
 */

    public static void main(String[] args) {
        int[] nums = {3,2,3};

        No4 no4 = new No4();
        System.out.println(no4.majorityElement1(nums));
    }
}
