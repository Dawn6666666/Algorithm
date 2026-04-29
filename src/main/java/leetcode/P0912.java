package leetcode;

//给你一个整数数组 nums，请你将该数组升序排列。
//
//你必须在 不使用任何内置函数 的情况下解决问题，时间复杂度为 O(nlog(n))，并且空间复杂度尽可能小。
//
//
//示例 1：
//
//输入：nums = [5,2,3,1]
//输出：[1,2,3,5]
//解释：数组排序后，某些数字的位置没有改变（例如，2 和 3），而其他数字的位置发生了改变（例如，1 和 5）。
//示例 2：
//
//输入：nums = [5,1,1,2,0,0]
//输出：[0,0,1,1,2,5]
//解释：请注意，nums 的值不一定唯一。
//
//提示：
//
//        1 <= nums.length <= 5 * 104
//        -5 * 104 <= nums[i] <= 5 * 104

import java.util.Arrays;

public class P0912 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 选择排序
    public static int[] selectionSort(int[] nums) {
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
    public static int[] bubbleSort(int[] nums) {
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
    public static int[] insertionSort(int[] nums) {
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

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }


}
