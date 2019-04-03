class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length >= 3) {
            int[] trip = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
            for (int num: nums) {
                if (num > trip[0]) {
                    if (num > trip[1])
                        return true;
                    trip[1] = num;
                }
                else
                    trip[0] = num;
            }
        }
        return false;
    }
}
