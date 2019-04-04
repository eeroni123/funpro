import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class teht5 {

    public static void main(String args[]) throws Exception {

        Map<String, Long> words = Files.lines(Paths.get("./src/kalevala.txt"), Charset.defaultCharset())
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .collect(groupingBy(Function.identity(), counting()));
        words.forEach((k,v)->System.out.println(k + ":" + v));

    }

}
