package DP;

import java.util.Arrays;

public class NO7 {
    public static void printArray(int[][] arr){
        for(int[]row : arr){
            System.out.println(Arrays.toString(row));
        }

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        // 构建状态空间
        int height =obstacleGrid.length;
        int width = obstacleGrid[0].length;
        int[][] ways = new int[height][width];

        for (int i=0;i<width;i++){
            // 如果没有障碍物
            if(obstacleGrid[0][i]!=1){
                ways[0][i]=1;
            }else{
                //有障碍物
                ways[0][i]=0;
            }
        }

        // 第一行第一列设为1，障碍我固定为0
        for (int i=0;i<height;i++){
            // 如果没有障碍物
            if(obstacleGrid[i][0]!=1){
                ways[i][0]=1;
            }else{
                //有障碍物
                ways[i][0]=0;
            }
        }

        // 关键找到障碍物
        //递推公式 ：if(obs[i,j]==1),way[i,j]=0,else way[i,j]=way[i-1,j]+way[i,j-1]
        for (int i=1;i<height;i++){
            for(int j=1;j<width;j++){
                // 如果存在障碍物，则设置为0
                if(obstacleGrid[i][j]==1){
                    ways[i][j]=0;
                }else{
                    ways[i][j]=ways[i-1][j]+ways[i][j-1];
                }
            }
        }
        return ways[height-1][width-1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0}};
        NO7 no7 = new NO7();
        System.out.println(no7.uniquePathsWithObstacles(obstacleGrid));
    }
}
