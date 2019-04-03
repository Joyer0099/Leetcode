class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fb = new ArrayList<String>(n);
        String f = "Fizz", b = "Buzz";
        for (int i = 1; i <= n; i ++) {
            if (i % 15 == 0)
                fb.add(f + b);
            else if (i % 3 == 0)
                fb.add(f);
            else if (i % 5 == 0)
                fb.add(b);
            else
                fb.add(String.valueOf(i));
        }
        return fb;
    }
}
