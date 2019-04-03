class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i ++)
            for (int j = i + 1; j < height.length; j ++)
                res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
        return res;
    }
}
