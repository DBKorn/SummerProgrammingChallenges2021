//Dovid Korn

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); //key is the number, value is index.
        int other;
        /*
         * If other is in the map, we now have both numbers, and return the indexes. If not, add nums[i] and its index
         * to map and maybe we'll get a hit in a future iteration
         */
        for (int i = 0; i < nums.length; i++) {
            other = target - nums[i];
            if (map.containsKey(other)){
                return new int[]{map.get(other), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}