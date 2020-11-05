package com.wys.practice.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangyushuai2@jd.com
 * @date 2020/11/3
 */
public class QuickSort {

    int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp = arr[left];
        while (i < j) {
            while (i < j && arr[j] > tmp) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while (i < j && arr[i] < tmp) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = tmp;
        return i;
    }

    void quick_sort(int arr[], int left, int right) {
        if(left > right) {
            return;
        }
        int j = partition(arr, left, right);
        quick_sort(arr, left, j - 1);
        quick_sort(arr, j + 1, right);
    }
    @Test
    public void test() {
        //int[] array = {4,7,6,5,3,2,8,1};
        int[] array = {1,2,3,4,5,6,7};
        int[] sortedArray = {4,1,7,2,3,5,6};
        quick_sort(sortedArray,0, sortedArray.length -1);
        Assert.assertTrue("快速排序", Arrays.equals(array,sortedArray));

    }
}
