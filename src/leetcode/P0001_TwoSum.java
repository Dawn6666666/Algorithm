package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>给定一个整数数组 <code>nums</code> 和一个整数目标值 <code>target</code>，请你在该数组中找出 <strong>和为目标值 </strong> <em><code>target</code></em>  的那 <strong>两个</strong> 整数，并返回它们的数组下标。</p>
 *
 * <p>你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。</p>
 *
 * <p>你可以按任意顺序返回答案。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>nums = [2,7,11,15], target = 9
 * <strong>输出：</strong>[0,1]
 * <strong>解释：</strong>因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * </pre>
 */
public class P0001_TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> hashTable = new HashMap<>();
            for(int i=0;i<nums.length;++i){
                if(hashTable.containsKey(target-nums[i])){
                    return new int[]{hashTable.get(target-nums[i]),i};
                }
                hashTable.put(nums[i],i);
            }
            return new int[0];
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
}
