class Solution {
    public boolean wordPattern(String pattern, String s) {
       String s1[] = s.split(" ");
      
      if (s1.length!=pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i=0;i<pattern.length();i++) {

            char ch = pattern.charAt(i);
            String str = s1[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(str)) return false;
            } else {
                map.put(ch, str);
                if (set.contains(str)) return false;
                set.add(str);
            }


        }

        return true;
        
    }
}
