class RandomizedSet {
    
    private List<Integer> set;
    private Random rand;
    private Map<Integer, Integer> map;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new ArrayList<>();
        rand = new Random();
        map = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        map.put(val, set.size());
        set.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int pos = map.get(val);
        if (pos < set.size() - 1) {
            Integer last = set.get(set.size() - 1);
            set.set(pos, last);
            map.put(last, pos);
        }
        set.remove(set.size() - 1);
        map.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return set.get(rand.nextInt(set.size()));
    }
}
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
