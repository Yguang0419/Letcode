package DP;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList使用
 */
public class ListUse {
    public static void main(String[] args) {
//        创建list
        List<Integer> nums = new ArrayList<>();
//        添加数据
        nums.add(1);
//        可以同时添加多个数据
        nums.add(2);
        nums.add(3);
//         遍历数据
        //第一种
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }
        //第二种
//        for (Integer num : nums) {
//            System.out.println(num);
//        }
        //获取指定位置的值
        Integer nnum0 = nums.get(0);
        //删除指定位置的值
        Integer integer = nums.remove(1);
        System.out.println("删除索引1的值："+integer+"--当前索引1的值："+nums.get(1));
        //修改指定位置的值
        nums.set(1,4);//将索引1的值修改为4
    }
}
