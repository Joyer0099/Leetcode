class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hMap = new HashMap<>();
        hMap.put('(', ')'); hMap.put('[', ']'); hMap.put('{', '}');
        
        //         designed by myself
        // Stack<Character> lbs = new Stack<>();
        // for (int i = 0; i < s.length(); i ++) {
        //     char bracket = s.charAt(i);
        //     if (bracket == '(' || bracket == '{' || bracket == '[')
        //         lbs.push(bracket);
        //     else
        //         if (lbs.empty() || hMap.get(lbs.pop()) != bracket)
        //             return false;
        // }
        // return lbs.isEmpty();
        
        //         update method
        Stack<Character> rbs = new Stack<>();
        for (char bracket: s.toCharArray()) {
            if (hMap.containsKey(bracket))
                rbs.push(hMap.get(bracket));
            else if (rbs.isEmpty() || rbs.pop() != bracket)
                return false;
        }
        return rbs.isEmpty();
    }
}
