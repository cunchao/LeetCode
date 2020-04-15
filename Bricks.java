package com.huawei.leetcode;

import java.util.HashMap;
import java.util.List;

/**
 * 示例：砖墙
 *
 * 输入: [[1,2,2,1],
 *       [3,1,2],
 *       [1,3,2],
 *       [2,4],
 *       [3,1,2],
 *       [1,3,1,1]]
 *
 * 输出: 2
 * @author cc
 *
 */
public class Bricks {
    public int leastBricks(List<List<Integer>> wall) {

        int size = wall.size();
        if (size == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < size;i++) {
            int temp = 0;
            for (int j = 0;j < wall.get(i).size() - 1;j++) {
                temp += wall.get(i).get(j);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
        }
        return size - map.values().stream().reduce(0, Integer::max);
    }
}
