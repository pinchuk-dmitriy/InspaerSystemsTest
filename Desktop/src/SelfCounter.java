import java.util.concurrent.atomic.AtomicInteger;

public class SelfCounter {

    public static AtomicInteger counter = new AtomicInteger(0);

    public SelfCounter() {
        counter.getAndIncrement();
    }
}
