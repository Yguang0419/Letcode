package Arrays;
//双指针之快慢指针

import java.util.Arrays;

public class Two_pointers {
//    删除数组中的指定元素，返回删除后的数组长度
      public int removeElement(int[] nums, int val) {
          int slow = 0;
          for(int fast = 0 ;fast< nums.length; fast++){
              if(nums[fast]!=val){
                  nums[slow]=nums[fast];
                  slow++;
              }
              System.out.println("----"+Arrays.toString(nums));
          }

          return slow+1;
      }
//    删除数组中的多余元素，每个元素只保留一个
    public int removeDuplicates(int[] nums) {
          int slow =0;
          for (int  fast=1;fast<nums.length;fast++){
//              如果出现了
              if(nums[fast]!=nums[slow]){
                //当不同时候
                  nums[slow+1]=nums[fast];
                  slow++;
              }
              System.out.println("----"+Arrays.toString(nums));
          }
        return slow+1;
    }
//    删除数组中的多余元素，每个元素至多保留两个
    public int removeDuplicates2(int[] nums) {

        int slow =0;
        for (int fast =0;fast<nums.length;fast++){
            System.out.println("----"+Arrays.toString(nums)+"==fast:"+fast+",slow:"+slow);
            //怎么确定这个元素出现次数少于两次
           if(slow<2||nums[slow-2]!=nums[fast]){
               nums[slow]=nums[fast];
               slow++;
           }

        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,3,4,4,5};
        int[] nums2 = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int[] nums3 = {1,2,2,3,3,3,4,4,4,4,5,5,5};
        Two_pointers twoPointers = new Two_pointers();
//        System.out.println(twoPointers.removeElement(nums, 3));
//        System.out.println(twoPointers.removeDuplicates(nums));
        System.out.println(twoPointers.removeDuplicates2(nums));

    }
}
