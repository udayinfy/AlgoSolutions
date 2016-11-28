/*
Given an array nums containing n + 1 integers where each integer is between 1 
and n (inclusive), prove that at least one duplicate number must exist. Assume 
that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n^2).
There is only one duplicate number in the array, but it could be repeated more 
than once.
 */
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int cur1 = nums[0];
        int cur2 = nums[nums[0]];
        while (cur1 != cur2) {
            cur1 = nums[cur1];
            cur2 = nums[nums[cur2]];
        }
        cur1 = nums[0];
        while (cur1 != cur2) {
            cur1 = nums[cur1];
            cur2 = nums[cur2];
        }
        return cur1;
    }

}
