package DP;

import java.util.Arrays;

public class No5 {
    public int uniquePaths(int m, int n) {
        // 定义状态空间
        int[][] dp = new int[m][n];
        // 初始化状态
        // 定义第一行
        for (int i = 0; i <= n - 1; i++) {
            dp[0][i] = 1;
        }
        // 定义第一列
        for (int i = 0; i <= m - 1; i++) {
            dp[i][0] = 1;
        }
//        for (int[] row : dp) {
//            System.out.println(Arrays.toString(row));
//        }
        // 递推公式 dp[i][j]=dp[i][j-1]+dp[i-1][j]
        // 以下代码采用的策略：一行一行的计算
        // 先遍历行
        // 外层循环遍历每一行
           for (int i = 1; i <=m-1; i++) {
            // 再遍历列
            for (int j = 1; j <=n-1; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

//        for (int i = 1; i < dp.length; i++) {
//            // 内层循环遍历每一行中的每个元素
//            for (int j = 1; j < dp[i].length; j++) {
//                // 访问并处理数组中的元素
//                dp[i][j]=dp[i][j-1]+dp[i-1][j];
//            }
//        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        No5 no5 = new No5();
        System.out.println(no5.uniquePaths(3, 7));

    }
}
