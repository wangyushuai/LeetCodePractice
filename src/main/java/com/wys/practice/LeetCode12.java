package com.wys.practice;

/**
 * Created by wangyushuai@fang.com on 2018/7/27.
 * Integer to Roman
 */
public class LeetCode12 {

    private static String[] M = {"","M","MM","MMM"};
    private static String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    private static String[] X = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    private static String[] I = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

    public  String intToRoman(int num) {
        if (num <0 || num > 3999) return "";
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[(num%10)];
    }
}
