class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pos1 = 0, pos2 = 0;
        ArrayList<Integer> lists = new ArrayList<Integer>();
        while (pos1 < nums1.length && pos2 < nums2.length) {
            if (nums1[pos1] < nums2[pos2])
                pos1 ++;
            else if (nums1[pos1] > nums2[pos2])
                pos2 ++;
            else {
                lists.add(nums1[pos1 ++]);
                pos2 ++;
            }
        }
        int[] res = new int[lists.size()];
        for(int i = 0; i < res.length; i ++) {
            res[i] = (Integer)lists.get(i);
        }
        return res;
    }
}
