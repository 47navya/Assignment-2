public class Memory {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Free Memory before GC: " + runtime.freeMemory());
        System.gc();  
        System.out.println("Free Memory after GC: " + runtime.freeMemory());
    }
}
