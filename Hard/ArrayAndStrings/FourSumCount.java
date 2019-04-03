class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = A.length;
        for (int i = 0; i < length; i ++)
            for (int j = 0; j < length; j ++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        int count = 0;
        for (int i = 0; i < length; i ++)
            for (int j = 0; j < length; j ++)
                count += map.getOrDefault(-1 * (C[i] + D[j]), 0);
        return count;
        
    }
}
