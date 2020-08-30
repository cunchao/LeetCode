package com.huawei.leetcode;

/**
 * 191. 位1的个数
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 *
 *
 *
 * 示例 1：
 *
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 * 示例 2：
 *
 * 输入：00000000000000000000000010000000
 * 输出：1
 * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
 * 示例 3：
 *
 * 输入：11111111111111111111111111111101
 * 输出：31
 * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
 */
public class BinaryCount {
    public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        int len = s.length();
        int count = 0;
        int index = 0;
        while (index <= len - 1) {
            if (s.charAt(index) == '1') {
                count++;
            }
            index++;
        }
        System.out.println(count);
        return count;
    }

    public int hammingWeight2(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        hammingWeight(-3);
    }
}
