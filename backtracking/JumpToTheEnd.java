/*
55. Jump Game
https://leetcode.com/problems/jump-game/

 */
package com.google.backtracking;

public class JumpToTheEnd {
    public static void main (String args[]) {
        int nums[] = new int[] {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        if( n == 0 )
            return false;
        if( n == 1)
            return true;
        if( nums[0] == 0)
            return false;
        return canJumpFromPosition(nums,0);
    }
    public static boolean canJumpFromPosition( int[] nums, int position) {
        if (position == nums.length - 1) {
            return true;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = furthestJump; nextPosition > position; nextPosition--) {
            if (canJumpFromPosition(nums, nextPosition)) {
                return true;
            }
        }

        return false;
    }

}
