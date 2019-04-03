// First u should convert List into Set(remove duplicates and become effective)
// The main points are:
// 1.using BFS to solve this problem.
// 2.using Queue to traverse the possible elements.

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Map<String, Integer> map = new HashMap<>();
        map.put(beginWord, 1);
        if (wordSet.contains(beginWord))
            wordSet.remove(beginWord);
        
        while (queue.peek() != null) {
            String top = queue.poll();
            StringBuilder sb;
            for (int i = 0; i < top.length(); i ++) {
                sb = new StringBuilder(top);
                for (char c = 'a'; c <= 'z'; c ++) {
                    sb.setCharAt(i, c);
                    String tempStr = sb.toString();
                    if (tempStr.equals(endWord) && wordSet.contains(tempStr))
                        return map.get(top) + 1;
                    if (wordSet.contains(tempStr)) {
                        queue.offer(tempStr);
                        wordSet.remove(tempStr);
                        map.put(tempStr, map.get(top) + 1);
                    }
                }
            }
        }
        
        return 0;
    }
}
