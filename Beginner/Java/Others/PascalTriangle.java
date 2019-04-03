class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i ++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j ++)
                row.set(j, row.get(j) + row.get(j + 1));
            //             must new an array list to store row and add it to res
            //             otherwise the row is changing all the time
            res.add(new ArrayList(row));
        }
        return res;
    }
}
