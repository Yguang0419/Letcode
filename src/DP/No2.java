package DP;

import java.util.Arrays;

public class No2 {

    public int maxProfit(int[] prices) {
        // 定义状态空间
        int[] profit =new int[prices.length];
        //初始化状态
        int minipricr = prices[0];

        profit[0] = 0;
        // 建立状态变换规则（推公式）
        for (int i = 1; i < prices.length; i++) {
            //当前价格卖出能获得的最大利润
            //1.从当前位置往左遍历找到最小值
//            for (int j = i; j >= 0; j--) {
//                minipricr = prices[j] < minipricr ? prices[j] : minipricr;
//            }
            //2.边遍历便寻找最小值
            minipricr = prices[i] < minipricr ? prices[i] : minipricr;
            int curentprofir = prices[i] - minipricr;
            profit[i] = profit[i-1]>curentprofir?profit[i - 1]:curentprofir;
        }

        return profit[prices.length-1];
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        No2 no2 = new No2();
        System.out.println(no2.maxProfit(prices));
    }
}
