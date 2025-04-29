
import java.util.Arrays;
public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 1, 3};
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
