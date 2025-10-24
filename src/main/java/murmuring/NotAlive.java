package murmuring;

public class NotAlive extends RuntimeException {
    public NotAlive(String errorMessage) {
        super(errorMessage);
    }
}
