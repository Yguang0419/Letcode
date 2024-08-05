package DP;

import java.util.ArrayList;
import java.util.List;

public class qiantaoList {
    public static void main(String[] args) {
//        嵌套集合
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            List<Integer> arr1 = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                arr1.add(j + 2);
            }
            arr.add(arr1);
        }
//        遍历集合
        System.out.println(arr.get(0).get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(arr.get(3));
    }
}
