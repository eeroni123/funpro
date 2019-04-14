import java.util.stream.IntStream;

public class teht2 {

    public static void main(String[] args) {
        //  sum of the triples of even integers from 2 to 10
        System.out.printf(
                "Sum of the triples of even integers from 2 to 10 is: %d%n",
                IntStream.rangeClosed(1, 10)
                        .map(x -> x * 3)
                        .peek(i -> System.out.println("peek1: " + i))
                        .filter(x -> x % 2 == 0)
                        .peek(i -> System.out.println("peek2: " + i))
                        .sum());
    }
}
