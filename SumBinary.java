package com.huawei.leetcode;

/**
 * 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class SumBinary {
    public String addBinary(String a, String b) {
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int jin = 0;
        StringBuilder sb = new StringBuilder();
        while (aLen >= 0 || bLen >= 0) {
            System.out.println(Integer.valueOf(a.substring(aLen, aLen + 1)));
            int tempA = aLen < 0 ? 0 : Integer.valueOf(a.substring(aLen, aLen + 1));
            int tempB = bLen < 0 ? 0 : Integer.valueOf(b.substring(bLen, bLen + 1));
            int sum = tempA + tempB + jin;
            jin = sum / 2;
            sb.append(sum % 2);
            aLen--;
            bLen--;
        }

        String res = jin == 0 ? sb.reverse().toString() : sb.append(jin).reverse().toString();
        System.out.println(res);
        return res;
    }

    public String addBinary2(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
        );
    }

    public static void main(String[] args) {
        new SumBinary().addBinary("110","11");
    }
}
