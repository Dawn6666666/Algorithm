package leetcode;

/**
 * <p>给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。</p>
 *
 * <p>请必须使用时间复杂度为 <em>O(log n)</em> 的算法。</p>
 *
 * <p><strong>示例 1:</strong></p>
 * <pre>
 * <strong>输入:</strong> nums = [1,3,5,6], target = 5
 * <strong>输出:</strong> 2
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 * <pre>
 * <strong>输入:</strong> nums = [1,3,5,6], target = 2
 * <strong>输出:</strong> 1
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 * <pre>
 * <strong>输入:</strong> nums = [1,3,5,6], target = 7
 * <strong>输出:</strong> 4
 * </pre>
 *
 * <p><strong>提示:</strong></p>
 * <ul>
 * <li><code>1 <= nums.length <= 10<sup>4</sup></code></li>
 * <li><code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code></li>
 * <li><code>nums</code> 为 <strong>无重复元素</strong> 的 <strong>升序</strong> 排列数组</li>
 * <li><code>-10<sup>4</sup> <= target <= 10<sup>4</sup></code></li>
 * </ul>
 */
public class P0035_SearchInsert {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(solution.searchInsert(nums, target));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length;
            while (left < right) {
                int mid = left + ((right - left) >> 1);
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
