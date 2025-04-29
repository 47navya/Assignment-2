import java.util.HashSet;

public class LongestSubString {
    static int longestUniqueSubString(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(longestUniqueSubString("abcabcbb")); 
        System.out.println(longestUniqueSubString("bbbbb")); 
        System.out.println(longestUniqueSubString("pwwkew")); 
    }
}

