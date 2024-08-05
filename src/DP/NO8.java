package DP;

import java.util.ArrayList;
import java.util.List;

public class NO8 {
    public int minimumTotal(List<List<Integer>> triangle) {
        // 初始化状态空间，构建一个一模一样的空间
        int layer =triangle.size();
//        int [][] value =new int[layer][layer];//用二维数组存储更好
//        value [0][0] =triangle.get(0).get(0);
        //    递推公式，vale（x,y）=Min[value(x-1,y-1),value(x-1,y)]+triangle(x,y);
        // 主意y=0时候没有y-1；也就是最左边的时候，没有左上方的父亲节点，同样最右边的时候没有右上方的父亲节点
        for(int x=1;x<layer;x++){
            for(int y=0;y<triangle.get(x).size();y++){
                if(y==0){
                    //最左边
//                    triangle.get(x).set(y)=value[x-1][y]+triangle.get(x).get(y);
                    Integer v = triangle.get(x-1).get(y)+triangle.get(x).get(y);
                    triangle.get(x).set(y,v);
                }else if(y==triangle.get(x).size()-1){
                    //最右边
//                    value[x][y]=value[x-1][y-1]+triangle.get(x).get(y);
                    Integer v = triangle.get(x-1).get(y-1)+triangle.get(x).get(y);
                    triangle.get(x).set(y,v);
                }else{
//                    value[x][y]=Math.min(value[x-1][y-1],value[x-1][y])+triangle.get(x).get(y);
                   Integer v= Math.min(triangle.get(x-1).get(y-1),triangle.get(x-1).get(y))+triangle.get(x).get(y);
                    triangle.get(x).set(y,v);
                }
            }
        }
        int min = triangle.get(layer-1).get(layer-1);
        // 寻找最后一行的最小值
        for (Integer num : triangle.get(layer-1)) {
            if(num<min){
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        NO8 no8 = new NO8();
        List<List<Integer>> layer = new ArrayList<>();
        List<Integer> layer1 = new ArrayList<>();
        List<Integer> layer2 = new ArrayList<>();
        List<Integer> layer3 = new ArrayList<>();
        List<Integer> layer4 = new ArrayList<>();
        layer1.add(2);
        layer2.add(3);
        layer2.add(4);
        layer3.add(6);
        layer3.add(5);
        layer3.add(7);
        layer4.add(4);
        layer4.add(1);
        layer4.add(8);
        layer4.add(3);
        layer.add(layer1);
        layer.add(layer2);
        layer.add(layer3);
        layer.add(layer4);
        System.out.println(no8.minimumTotal(layer));
    }
}
