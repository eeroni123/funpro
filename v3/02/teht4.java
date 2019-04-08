import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class teht4 {

    private static class FibonacciSupplier implements IntSupplier {
        int current = 0;
        int previous = 1;

        @Override
        public int getAsInt() {
            int result = current;
            current = previous + current;
            previous = result;
            return result;
        }
    };

    public static void main(String[] args) {
        FibonacciSupplier fibo = new FibonacciSupplier();
        IntStream
                .generate(fibo)
                .limit(10)
                .forEach(System.out::println);
    }
}
