package com.wys.practice.sort;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * 快速排序
 * @author wangyushuai2@jd.com
 * @date 2020/11/3
 */
public class QuickSort {

    int partition(int arr[], int left, int right) {
        int pivot = arr[left];
        while(left < right) {
            while (left < right && arr[right] > pivot) {
                right --;
            }
            if (left < right) {
                arr[left] = arr[right];
                left ++;
            }
            while (left < right && arr[left] < pivot) {
                left ++;
            }
            if (left < right) {
                arr[right] = arr[left];
                right --;
            }
        }
        arr[left] = pivot;
        return left;
    }

    void quick_sort(int arr[], int left, int right) {
        if (left >= right) {
            return;
        }
        int p = partition(arr,left,right);
        quick_sort(arr,left,p-1);
        quick_sort(arr,p+1,right);


    }
    @Test
    public void test() {
        //int[] array = {4,7,6,5,3,2,8,1};
        int[] array = {1,2,3,4,5,6,7};
        int[] sortedArray = {4,1,7,2,3,5,6};
        quick_sort(sortedArray,0, sortedArray.length -1);
        Assert.assertEquals("快速排序",StringUtils.join(array,','),StringUtils.join(sortedArray,','));

    }
}
