package leetcode;

/**
 *
 * <p>峰值元素是指其值严格大于左右相邻值的元素。</p>
 *
 * <p>给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。</p>
 *
 * <p>你可以假设 nums[-1] = nums[n] = -∞ 。</p>
 *
 * <p>你必须实现时间复杂度为 O(log n) 的算法来解决此问题。</p>
 * <p>
 * <!-- 示例部分 -->
 * <p><strong>示例 1:</strong></p>
 * <pre>
 * <strong>输入:</strong> nums = [1,2,3,1]
 * <strong>输出:</strong> 2
 * <strong>解释:</strong> 3 是峰值元素，你的函数应该返回其索引 2。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 * <pre>
 * <strong>输入:</strong> nums = [1,2,1,3,5,6,4]
 * <strong>输出:</strong> 1 或 5
 * <strong>解释:</strong> 你的函数可以返回索引 1，其峰值元素为 2；
 *      或者返回索引 5， 其峰值元素为 6。
 * </pre>
 */
public class P0162_FindPeakElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // 自动生成的测试用例 (基于示例 1)
        int[] nums = {1, 2, 3, 1};

        // 调用方法并打印结果
        System.out.println(solution.findPeakElement(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int findPeakElement(int[] nums) {
            int n = nums.length;
            if (n == 1) return 0;
            if (nums[0] > nums[1]) return 0;
            if (nums[n - 2] < nums[n - 1]) return n - 1;

            int left = 0, right = n - 1, ans = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid - 1] > nums[mid]) {
                    right = mid - 1;
                }
                else if (nums[mid] < nums[mid + 1]) {
                    left = mid + 1;
                }
                else {
                    ans = mid;
                    break;
                }
            }

            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
