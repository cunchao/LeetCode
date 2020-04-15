package test;

import com.huawei.leetcode.Bricks;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBricks {

    @Test
    public void testLeastBricks() {
        List<List<Integer>> bricks = new ArrayList<>();
        bricks.add(Arrays.asList(1,2,2,1));
        bricks.add(Arrays.asList(3,1,2));
        bricks.add(Arrays.asList(1,3,2));
        bricks.add(Arrays.asList(2,4));
        bricks.add(Arrays.asList(3,1,2));
        bricks.add(Arrays.asList(1,3,1,1));

        Assert.assertEquals(2, new Bricks().leastBricks(bricks));

    }
}
