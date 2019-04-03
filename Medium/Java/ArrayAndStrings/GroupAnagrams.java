class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        for (String str: strs) {
            boolean insert = false;
            char[] strc = str.toCharArray();
            Arrays.sort(strc);
            for (List<String> r: res) {
                char[] temp = r.get(0).toCharArray();
                Arrays.sort(temp);
                if (new String(strc).compareTo(new String(temp)) == 0) {
                    r.add(str);
                    insert = true;
                }
            }
            if (!insert) {
                res.add(new ArrayList(Arrays.asList(str)));
            }
        }
        return res;
    }
}
