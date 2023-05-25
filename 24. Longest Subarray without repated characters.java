class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int count = 0;

        //  Brute Force(Nested Loop)
        // for(int i=0; i<n; i++){
        //     HashSet<Character> set = new HashSet<>();
        //     for(int j=i; j<n; j++) {
        //         char ch = s.charAt(j);
        //         if(set.contains(ch)) { 
        //             break;
        //         } else {
        //             set.add(ch);
        //         }
        //         count = Math.max(count, j-i+1);

        //     }
        // }

        // Optimal Approach (Sliding Window)
        // int l=0;
        // HashSet<Character> set = new HashSet<>();
        // for(int r=0; r<n; r++) {
        //     char ch = s.charAt(r);
        //     if(set.contains(ch)) {
        //         while (l < r&& set.contains(ch)) {
        //             set.remove(s.charAt(l));
        //             l++;
        //         }
        //     }
        //     set.add(ch);
        //     count = Math.max(count, r-l+1);
        // }

        // Best Approach(Hashing)
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        int l = 0, r = 0;
        while(r<n) {
            char ch = s.charAt(r);
            if(map.containsKey(ch)) {
                l = Math.max(map.get(ch) + 1, l);
            }
            map.put(ch, r);
            count = Math.max(count, r-l+1);
            r++;
        }
        
        return count;
        
    }
}