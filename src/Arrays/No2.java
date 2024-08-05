package Arrays;

import java.util.Arrays;

public class No2 {
    public int removeElement(int[] nums, int val) {
        if (nums.length==0){
            return 0;
        }
// 如果等于2，则变成“-”然后和最后的交换，但并不移动指针，只有不等于2才移动
        int p =0;
        int n = nums.length;
//        交换
        while (p!=n){
//            相同
            if(nums[p]==val){
//                交换
               nums[p] = nums[n-1];
               nums[n-1] = -97854799;
//               指针n前移
                n--;
            }else {
                //            如果不同
                p++;
            }
//            System.out.println(Arrays.toString(nums));
        }
        return p;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2,6};
        int val =2;

        No2 no2 = new No2();
        int i = no2.removeElement(nums, val);
        System.out.println(i);
    }
}
