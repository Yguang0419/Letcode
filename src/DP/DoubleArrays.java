package DP;

import java.util.Arrays;

/**
 * 二维数组练习
 */
public class DoubleArrays {
//    打印二维数组
    public static void printArray(int[][] arr){
        for(int[]row : arr){
            System.out.println(Arrays.toString(row));
        }

    }
    public static void main(String[] args) {
        //    新建二维数组(坐标（行，列）)
        int [][] arr = new int[1][2];
        //    获取数组的长度（高和宽）
        int height =arr.length;
        int width = arr[0].length;
        System.out.println("二维数组的长度是：" + height + " " + width);
//        初始化第一行
        for (int i=0;i<width;i++){
            arr[0][i]=1;
        }
//        初始化第一列
        for(int i=0;i<height;i++){
            arr[i][0]=1;
        }
        printArray(arr);
//
        //    遍历二维数组

    }

}
