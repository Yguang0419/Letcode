package DP;
import java.util.Arrays;
public class No6 {
    public int minPathSum(int[][] grid) {
        // 创建个和grid一样大的数组
        // 获取grid的长和宽
        int height =grid.length;
        int width = grid[0].length;
        int [][] value =new int[height][width];

        // 初始化
        value[0][0]=grid[0][0];
        for(int i=1;i<width;i++){
            value[0][i] = grid[0][i]+value[0][i-1];
        }

        for(int j=1;j<height;j++){
            value[j][0] = grid[j][0]+value[j-1][0];
        }

        // 递推
        for(int i=1;i<height;i++){
            for(int j=1;j<width;j++){
                value[i][j]=Math.min(value[i-1][j],value[i][j-1])+grid[i][j];
            }
        }

        return value[height-1][width-1];
    }
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6}};
        No6 no6 = new No6();
        System.out.println(no6.minPathSum(grid));
    }
}
