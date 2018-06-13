/**
 * Created by wangyushuai@fang.com on 2018/4/13.
 */
public class Leetcode4 {
    public static void main(String[] args) {
      int[] num1 =  {1,2};
      int[] num2 = {3,4};
        System.out.println( findMedianSortedArrays(num1,num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] result  = new int[nums1.length + nums2.length];

        if (nums1.length == 0 && nums2.length == 0)
            return 0;
        if (result.length == 1)
            return nums1.length == 0? nums2[0] : nums1[0];

        int i=0,j=0,count=0;
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[count]  = nums1[i];
                i ++;
            } else  {
                result[count] = nums2[j];
                j ++;
            }
            count ++;
        }

        while(i < nums1.length) {
            result[count] = nums1[i];
            i ++;
            count ++;
        }

        while (j < nums2.length) {
            result[count] = nums2[j];
            j ++;
            count ++;
        }


        double medianNum = 0;
        if (result.length %2 == 0) {
            int si = result.length/2;
            medianNum = (double)(result[si - 1] + result[si]) / 2;
        } else {
            medianNum = result[(result.length / 2)];
        }

        return medianNum;
    }
}
