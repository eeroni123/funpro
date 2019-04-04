import java.util.Random;
import java.util.stream.Stream;

public class teht3 {


    public static void main(String args[]) {
        Random rnd = new Random();
        long sixes = Stream
                .iterate(0, x -> rnd.nextInt(6) + 1)
                .limit(20)
                .filter(x -> x == 6)
                .count();

        System.out.println("Number of sixes from 20 randomly generated numbers: " + sixes);
    }
}
