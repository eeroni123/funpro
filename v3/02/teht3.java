import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class teht3 {

    public static void main(String[] args) {

        IntStream
                .generate(() -> (int) (Math.random() * 40 + 1))
                .limit(8)
                .forEach(System.out::println);

        IntStream
                .generate(new IntSupplier() {
                    @Override
                    public int getAsInt() {
                        return (int) (Math.random() * 40 + 1);
                    }
                })
                .limit(8)
                .forEach(System.out::println);
    }
}
