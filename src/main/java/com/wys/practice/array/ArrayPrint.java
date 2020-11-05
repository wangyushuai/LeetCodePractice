package com.wys.practice.array;

import org.junit.Test;

/**
 * 二维数组
 * @author wangyushuai2@jd.com
 * @date 2020/11/4
 */
public class ArrayPrint {

    @Test
    public void test() {
        int arr[][] = {{1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}};
        print(arr);
    }


    /**
     * Print
     * @param arr
     */
    public void print(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int totalNum = row * col;

        int flag = 1, count = 0;
        while(true) {
            // 打印上边
            for (int j = flag - 1; j <= col - flag - 1; j++) {
                count += 1;
                System.out.println(arr[flag - 1][j] + " ");
            }
            // 打印右边
            for (int i = flag - 1; i <= row - flag - 1; i++) {
                count += 1;
                System.out.println(arr[i][col - flag] + " ");
            }
            // 打印下边
            for (int j = col - flag; j >= flag; j--) {
                count += 1;
                System.out.println(arr[row - flag][j] + " ");
            }
            for (int i = row - flag; i >= flag; i--) {
                count += 1;
                System.out.println(arr[i][flag - 1] + " ");
            }
            if (count == totalNum) {
                break;
            }
            flag += 1;
        }
    }
}
