package leetcode;

/**
 * <p>给定一个 n 个元素有序的（升序）整型数组 <code>nums</code> 和一个目标值 <code>target</code> ，写一个函数搜索 <code>nums</code> 中的 <code>target</code>，如果 <code>target</code> 存在返回下标，否则返回 -1。</p>
 *
 * <p>你必须编写一个具有 <em>O(log n)</em> 时间复杂度的算法。</p>
 *
 * <p><strong>示例 1:</strong></p>
 * <pre>
 * <strong>输入:</strong> nums = [-1,0,3,5,9,12], target = 9
 * <strong>输出:</strong> 4
 * <strong>解释:</strong> 9 出现在 nums 中并且下标为 4
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 * <pre>
 * <strong>输入:</strong> nums = [-1,0,3,5,9,12], target = 2
 * <strong>输出:</strong> -1
 * <strong>解释:</strong> 2 不存在 nums 中因此返回 -1
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li>你可以假设 <code>nums</code> 中的所有元素是不重复的。</li>
 * <li><code>n</code> 将在 [1, 10000]之间。</li>
 * <li><code>nums</code> 的每个元素都将在 [-9999, 9999]之间。</li>
 * </ul>
 */
public class P0704_BinarySearch {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(solution.search(nums, target));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length;
            while (left < right) {
                int mid = left + ((right - left) >> 1);
                if (nums[mid] == target) {
                    return mid;
                }
                else if (nums[mid] < target) {
                    left = mid + 1;
                }
                else {
                    right = mid;
                }
            }
            return -1;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}