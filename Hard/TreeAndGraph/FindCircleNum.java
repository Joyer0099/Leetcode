class Solution {
    public int findCircleNum(int[][] M) {
        int count = 0;
        boolean[] visit = new boolean[M.length];
        for (int i = 0; i < M.length; i ++)
            if (!visit[i]) {
                dfs (M, visit, i);
                count ++;
            }
        return count;
    }
    
    public void dfs(int[][] M, boolean[] visit, int i) {
        for (int j = 0; j < M.length; j ++)
            if (M[i][j] == 1 && !visit[j]) {
                visit[j] = true;
                dfs(M, visit, j);
            }
    }
}
