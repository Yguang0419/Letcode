package Arrays;

import java.util.Arrays;

/**
 * 合并两个有序数组
 * 描述：给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 */
public class No1 {
    public static void main(String[] args) {
        No1 run = new No1();
        int [] nums1 = {0};
        int [] nums2 = {1};
        run.merge(nums1,0,nums2,1);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        1.复制一份Nums1
        int [] copyNums1 = new int[nums1.length];
        int p1 =0; //nums1Copy的指针
        int p2 =0;//nums2的指针
        int p = 0;//nums1的指针
        System.arraycopy(nums1, 0, copyNums1, 0, nums1.length);
//        System.out.println(Arrays.toString(copyNums1));
        while (p<n+m&&p1<m){
//            将mums1的元素和nums2作比较然后写进去copyNums1
            if(copyNums1[p1]>nums2[p2]){
//                赋值，指针移动
                nums1[p]=nums2[p2];
                p2++;
            }else {
                nums1[p]=copyNums1[p1];
                p1++;
            }
            p++;
        }
//        p1所有值都写进去了，只剩下为0到的
        System.arraycopy(nums2, p2, nums1, p2+p1, nums1.length-p2-p1);
        System.out.println(Arrays.toString(nums1));

    }

}

