import java.util.HashMap;

public class GameOfThrones {
    static String canFormPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        for (int freq : map.values()) {
            if (freq % 2 != 0) oddCount++;
        }
        return (oddCount <= 1) ? "YES" : "NO";
    }
    public static void main(String[] args) {
        System.out.println(canFormPalindrome("civic")); // YES
        System.out.println(canFormPalindrome("aabbccdd")); // YES
        System.out.println(canFormPalindrome("abcd")); // NO
    }
}
