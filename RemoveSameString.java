/**
 * 26. 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 题解：双指针解法
 */
public class RemoveSameString {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int left = 0;
        int right = 1;
        while(right < nums.length) {
            if (nums[left] != nums[right]) {
                if (right - left > 1) {
                    nums[left + 1] = nums[right];
                }
                left++;
            }
            right++;
        }
        return left + 1;
    }
}
