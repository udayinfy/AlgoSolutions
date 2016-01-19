/*
 * Given n non-negative integers representing an 
 * elevation map where the width of each bar is 
 * 1, compute how much water it is able to trap 
 * after raining.

Trapping Rain Water

Example
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.

Challenge
O(n) time and O(1) memory

O(n) time and O(n) memory is also acceptable.
 */
public class TrappingRainWater {

    /**
     * @param heights: an array of integers
     * @return: a integer
     */
    public int trapRainWater(int[] heights) {
        int result = 0;
        int leftMax = 0;
        int rightMax = 0;
        int low = 0;
        int high = heights.length;
        while (low < high) {
            if (leftMax < rightMax) {

            } else {

            }
        }
        return result;
    }

    public int trapRainWater(int[] heights) {
        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];
        for (int i = 0; i < heights.length; ++i) {
            leftMax[i] = Math.max(leftMax[i - (i == 0 ? 0 : 1)], heights[i]);
            rightMax[heights.length - 1 - i] = 
                Math.max(rightMax[heights.length - (i == 0 ? 1 : 0) - i], 
                        heights[heights.length - 1 - i]);
        }
        int result = 0;
        for (int i = 0; i < heights.length; ++i) {
            result += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }
        return result;
    }

}
