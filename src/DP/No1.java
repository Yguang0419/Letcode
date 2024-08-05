package DP;
//斐波那契数列
public class No1 {
    class Solution {
        int [] nums =new int[31];

        public int fib(int n) {
            nums[0]=0;
            nums[1]=1;
            for (int i=2;i<=n;i++){
                nums[n]=nums[n-1]+nums[n-2];
            }
            return nums[1];


        }
    }
}
