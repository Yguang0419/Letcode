package DP;

import java.awt.geom.Area;
import java.util.Arrays;

public class No4 {
    public int deleteAndEarn(int[] nums) {
        /**
         以[2，2，3，3，3，4]为例；
         1.转换数组==》count [0,0,2,3,1,0,0,0.......]
         2.这样就能转换成打家劫舍的问题：不能取下标（因为我们的数组的下标就是元素的值，
         如果nums[i]=x,那么它count的下标也就是x,那么nuss[i+-1]=count+-1),将值相邻转换成下标相邻
         3.值相邻转换成下标相邻后，利用打家劫舍方法获取最大值，值得注意的是，打家劫舍中数组每个元素代表的是价值，但在这个问题中，数组每个元素代表的出现次数，而下标代表了其价值；那么价值=次数*下标；
         */
        // 转换数组，将值相邻转换成下标相邻。存储每个元素出现的次数，数组的长度就是元素的范围（10^4）
        int [] count =new int [10000+1];//记录数据范围，加一防止溢出
        //记录出现次数
        //记录最大值
        int maxValue =0;
        for(int num : nums){
            count[num]++;
            maxValue=Math.max(maxValue,num);
        }
        //下标相邻后可以看成打家劫舍
        //定义状态空间

        int[] dp =new int[maxValue+1];//dp的长度应该和count长度一直
        //初始化,主意问题的边界,如果前面少一个，后面都得移动一位
//         dp[0]=count[1]*1;
//         dp[1]=Math.max(dp[0],count[2]*2);
       dp[1] = count[1];
        //递推公式
        for (int i=2;i<=maxValue;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+i*count[i]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[maxValue];
    }

    public static void main(String[] args) {

        No4 no4 = new No4();
        System.out.println(no4.deleteAndEarn(new int[]{2,2,3,3,3,4}));//预期==9
    }
}
