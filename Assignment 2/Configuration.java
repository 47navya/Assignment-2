public final class Configuration {
    private final String key;
    private final String value;

    public Configuration(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() { return key; }
    public String getValue() { return value; }
}
public class Configuration {
    public static void main(String[] args) {
        Configuration config = new Configuration("server", "localhost");
        System.out.println("Key: " + config.getKey());
        System.out.println("Value: " + config.getValue());
    }
}
