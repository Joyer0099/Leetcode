class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (char task: tasks)
            count[task - 'A'] ++;
        Arrays.sort(count);
        int mc = 1;
        for (int i = 25; i > 0; i --) {
            if (count[i] == count[i - 1])
                mc ++;
            else break;
        }
        return Math.max(tasks.length, (count[25] - 1) * (n + 1) + mc);
    }
}
