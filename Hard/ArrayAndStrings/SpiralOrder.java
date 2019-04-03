class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0)
            return res;
        int rs = 0, re = matrix.length - 1, cs = 0, ce = matrix[0].length - 1;
        while (re >= rs && ce >= cs) {
            // Traverse right
            for (int i = cs; i <= ce; i ++)
                res.add(matrix[rs][i]);
            rs ++;
            
            // Traverse down
            for (int i = rs; i <= re; i ++)
                res.add(matrix[i][ce]);
            ce --;
            
            // Traverse left
            if (rs <= re)
                for (int i = ce; i >= cs; i --)
                    res.add(matrix[re][i]);
            re --;
            
            // Traverse up
            if (cs <= ce)
                for (int i = re; i >= rs; i --)
                    res.add(matrix[i][cs]);
            cs ++;
        }
        return res;
    }
}
