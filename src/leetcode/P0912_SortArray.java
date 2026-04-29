package leetcode;

import java.util.Arrays;

/**
 * <!-- 题目描述 -->
 * <p>给你一个整数数组 <code>nums</code>，请你将该数组升序排列。</p>
 * <p>你必须在 <strong>不使用任何内置函数</strong> 的情况下解决问题，时间复杂度为 <code>O(nlog(n))</code>，并且空间复杂度尽可能小。</p>
 *
 * <!-- 示例部分 -->
 * <p><strong>示例 1:</strong></p>
 * <pre>
 * <strong>输入:</strong> nums = [5,2,3,1]
 * <strong>输出:</strong> [1,2,3,5]
 * <strong>解释:</strong> 数组排序后，某些数字的位置没有改变（例如，2 和 3），而其他数字的位置发生了改变（例如，1 和 5）。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 * <pre>
 * <strong>输入:</strong> nums = [5,1,1,2,0,0]
 * <strong>输出:</strong> [0,0,1,1,2,5]
 * <strong>解释:</strong> 请注意，nums 的值不一定唯一。
 * </pre>
 *
 * <!-- 提示部分 -->
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>1 &lt;= nums.length &lt;= 5 * 10<sup>4</sup></code></li>
 * <li><code>-5 * 10<sup>4</sup> &lt;= nums[i] &lt;= 5 * 10<sup>4</sup></code></li>
 * </ul>
 */
public class P0912_SortArray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 2, 3, 1};
        System.out.println(Arrays.toString(solution.sortArray(nums)));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int[] sortArray(int[] nums) {
            // 目前使用插入排序作为示例，注意：插入排序在极端情况下可能超时 O(N^2)
            // 题目要求 O(nlog(n))，实际应使用归并、快排或堆排序。
            return insertionSort(nums);
        }

        public void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 选择排序
        public int[] selectionSort(int[] nums) {
            if (nums == null || nums.length == 0) return nums;
            for (int i = 0; i < nums.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < nums[minIndex]) {
                        swap(nums, j, minIndex);
                    }
                }
            }
            return nums;
        }

        // 冒泡排序
        public int[] bubbleSort(int[] nums) {
            if (nums == null || nums.length == 0) return nums;
            for (int end = nums.length - 1; end > 0; end--) {
                for (int i = 0; i < end; i++) {
                    if (nums[i] > nums[i + 1]) {
                        swap(nums, i, i + 1);
                    }
                }
            }
            return nums;
        }

        // 插入排序
        public int[] insertionSort(int[] nums) {
            if (nums == null || nums.length == 0) return nums;
            for (int i = 1; i < nums.length; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] > nums[j + 1]) {
                        swap(nums, j, j + 1);
                    }
                }
            }
            return nums;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
