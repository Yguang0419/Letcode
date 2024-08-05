package DP;

public class No3{
    public int maxProfitOne(int[] prices) {
        // 定义状态空间
        int[] profit =new int[prices.length];
        //初始化状态
        int minipricr = prices[0];
        profit[0] = 0;
        // 建立状态变换规则（推公式）
        for (int i = 1; i < prices.length; i++) {
            //当前价格卖出能获得的最大利润
            //1.从当前位置往左遍历找到最小值

            //2.边遍历便寻找最小值
            minipricr = prices[i] < minipricr ? prices[i] : minipricr;
            int curentprofir = prices[i] - minipricr;
            profit[i] = profit[i-1]>curentprofir?profit[i - 1]:curentprofir;
        }

        return profit[prices.length-1];
    }
    public int maxProfit(int[] prices) {
        int allProfit =0;
        int startIndex =0;
        for (int i=0;i<prices.length;i++){
            int [] newNUM =new int[i+1];
            System.arraycopy(prices, startIndex, newNUM, 0, i+1-startIndex);
            int profit = maxProfitOne(newNUM);
            if(profit>0){
                startIndex=i;
                allProfit=allProfit+profit;
            }
        }
        return allProfit;

    }
    public static void main(String[] args) {
        int[] prices = {7,6,5,4,3,1};
        No3 no3 = new No3();
        System.out.println(no3.maxProfit(prices));
    }
}
