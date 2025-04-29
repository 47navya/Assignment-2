import java.util.Scanner;

public class Integer {
    public static int encode(int num) {
        return num ^ (num >> 16); // Simple bitwise encoding
    }

    public static int decode(int encoded) {
        return encoded ^ (encoded >> 16); // Simple bitwise decoding
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int encoded = encode(number);
        int decoded = decode(encoded);
        
        System.out.println("Original: " + number);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);
    }
}
