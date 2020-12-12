package com.yangtao.sort.bubble;

import java.util.Arrays;

/**
 * @author：杨涛
 */
public class Bubble {
    public static void bubbleSort(int[] arr){
        if ( arr==null || arr.length<=1){
            return;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println("第"+(i+1)+"轮："+arr[i]);
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array ={1,3,5,2,9,6,8,7,0,4};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
