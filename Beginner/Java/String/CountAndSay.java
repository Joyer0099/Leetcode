class Solution {
    public String countAndSay(int n) {
        StringBuilder cur = new StringBuilder("1");
        StringBuilder pre;
        int count;
        char say;
        for (int i = 1; i < n; i ++) {
            pre = cur;
            cur = new StringBuilder();
            count = 1;
            say = pre.charAt(0);
            for (int j = 1; j < pre.length(); j ++) {
                if (pre.charAt(j) == say)
                    count ++;
                else {
                    cur.append(count).append(say);
                    count = 1;
                    say = pre.charAt(j);
                }
            }
            cur.append(count).append(say);
        }
        return cur.toString();
    }
}
