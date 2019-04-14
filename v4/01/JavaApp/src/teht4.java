import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class teht4 {

    public static void main(String[] args) {
        System.out.println(measurePerfKalevala()+"msecs");
        System.out.println(measurePerfKalevalaParallel()+"msecs");

    }

    public static void kalevala(){
        Map<String, Long> words = null;
        try {
            words = Files.lines(Paths.get("./src/kalevala.txt"), Charset.defaultCharset())
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .collect(groupingBy(Function.identity(), counting()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void kalevalaParallel(){
        Map<String, Long> words = null;
        try {
            words = Files.lines(Paths.get("./src/kalevala.txt"), Charset.defaultCharset())
                    .parallel()
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .collect(groupingBy(Function.identity(), counting()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long measurePerfKalevala() {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            kalevala();
            long duration = (System.nanoTime() - start) / 1_000_000;
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }
    public static long measurePerfKalevalaParallel() {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            kalevalaParallel();
            long duration = (System.nanoTime() - start) / 1_000_000;
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }

}
