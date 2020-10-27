package com.wys.practice;

/**
 * Created by wangyushuai@fang.com on 2018/5/9.
 * 思路：
 * 将字符按"z"型存入二维数组，而后按行读出
 */
public class LeetCode6 {
    public static void main(String args[])
    {
      System.out.println(convert("PAYPALISHIRING",5));
    }
//    static class Node {
//        Node(String nodeStr,String operator){
//            this.nodeStr = nodeStr;
//            this.operator = operator;
//        }
//        Node() {}
//        String nodeStr;
//        String operator;
//    }

    public static String convert(String s, int numRows) {
        if (s.isEmpty() || s.length() == 1 || numRows == 1)
            return s;

        int rowN = numRows;
        int range = 2*rowN -2;
        int colN = s.length() > range ?(s.length()/range + 1)*(rowN - 1)  : (s.length() % rowN) + 1 ;

        String[][] array = new String[rowN][colN];

        //save
        int rc = 0; //row num count
        int cc = 0; // column num count
        for (char c : s.toCharArray()) {
            array[rc][cc] = c +"";

            if ((rc + 1) == rowN || cc %(rowN -1) != 0) {
                rc--;
                cc ++;
            } else {
                rc ++;
            }
        }

        //read
        String result = "";
        for (int i = 0; i < rowN; i++) {
            for (int j = 0; j < colN; j ++) {
                if (array[i][j] == null)
                    continue;
                result += array[i][j];
            }
        }

        return  result;
    }


}

