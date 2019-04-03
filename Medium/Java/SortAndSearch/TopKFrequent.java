class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int num: nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key: map.keySet()) {
            int fre = map.get(key);
            if (bucket[fre] == null)
                bucket[fre] = new LinkedList<>();
            bucket[fre].add(key);
        }
        for (int i = bucket.length - 1; i > 0 && k > 0; i --)
            if (bucket[i] != null) {
                res.addAll(bucket[i]);
                k -= bucket[i].size();
            }
        return res;
    }
}
