public class Majority {
    static int majority(int[] arr) {
        int count = 0, candidate = -1;
        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3, 2, 4};
        System.out.println(majority(arr));
    }
}