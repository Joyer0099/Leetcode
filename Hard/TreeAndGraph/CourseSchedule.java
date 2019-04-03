// It's edge lists.
// Adjacency matrix is a better way to solve this problem.

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        int[][] adjMatrix = new int[numCourses][numCourses];
        for (int i = 0; i < prerequisites.length; i ++) {
            adjMatrix[prerequisites[i][0]][prerequisites[i][1]] = 1;
            indegree[prerequisites[i][1]] ++;
        }
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < indegree.length; i ++)
            if (indegree[i] == 0)
                queue.offer(i);
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count ++;
            for (int i = 0; i < numCourses; i ++)
                if (adjMatrix[course][i] != 0 && -- indegree[i] == 0)
                    queue.offer(i);
        }
        System.out.println(count);
        return count == numCourses;
    }
}
