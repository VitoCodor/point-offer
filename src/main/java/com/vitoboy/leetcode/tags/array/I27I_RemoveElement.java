package com.vitoboy.leetcode.tags.array;

/**
 * 
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。 
 * 
 *  不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。 
 * 
 *  元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。 
 * 
 *  
 * 
 *  说明: 
 * 
 *  为什么返回数值是整数，但输出的答案是数组呢? 
 * 
 *  请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。 
 * 
 *  你可以想象内部操作如下: 
 * 
 *  
 * // nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
 * int len = removeElement(nums, val);
 * 
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 *
 *  示例 1：
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2]
 * 解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，而 num
 * s = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
 *  
 * 
 *  示例 2：
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3]
 * 解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面
 * 的元素。
 *  
 * 
 *  
 * 
 *  提示：
 *  0 <= nums.length <= 100 
 *  0 <= nums[i] <= 50 
 *  0 <= val <= 100 
 *  
 *  Related Topics 数组 双指针 
 *  👍 932 👎 0
 * 
 * 
 * 
 * @author vito
 * @version 1.0
 * @date 2021/5/27
 */
public class I27I_RemoveElement {
    public static void main(String[] args) {
        
    }

    /**
     * 				解答成功:
     * 				执行耗时:0 ms,击败了100.00% 的Java用户
     * 				内存消耗:37.2 MB,击败了7.11% 的Java用户
     * 时间复杂度: O(N)          只与数组长度有关
     * 空间复杂度: O(1)          使用了固定变量
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[cur] = nums[i];
                cur++;
            }
        }
        
        return cur+1;
    }


    /**
     *     作者：LeetCode-Solution
     *     链接：https://leetcode-cn.com/problems/remove-element/solution/yi-chu-yuan-su-by-leetcode-solution-svxi/
     *     来源：力扣（LeetCode）
     *     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * 				解答成功:
     * 				执行耗时:0 ms,击败了100.00% 的Java用户
     * 				内存消耗:37.1 MB,击败了33.12% 的Java用户
     *
     *
     * 	记录官方的另一种题解
     *
     * @param nums
     * @param val
     * @return
     */
    public int removeElementII(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }


}
