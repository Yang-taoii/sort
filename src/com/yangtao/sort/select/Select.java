package com.yangtao.sort.select;

import java.util.Arrays;

/**
 * @author：杨涛
 * @create: 2020-12-17 08:37
 * 选择排序
 */
public class Select {
    private static int[] select(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            int minIndex  = i;
            for (int j = i+1; j <arr.length ; j++) {
                //找到最小数的下标
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            //交换两数的位置
            if (i!=minIndex){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array ={1,3,5,2,9,6,8,7,0,4};
        select(array);
        System.out.println(Arrays.toString(array));
    }
    
}
