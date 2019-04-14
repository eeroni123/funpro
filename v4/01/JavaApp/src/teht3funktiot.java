import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class teht3funktiot {

    public static long hidasNelioSumma(long n) {
        LinkedList<Integer> linkitettyLista = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            linkitettyLista.add(i);
        }
        return linkitettyLista.stream()
                .map(x -> x * x)
                .reduce(0, (acc, x) -> acc + x);

    }

    public static long hidasNelioSumma2(long n) {
        ArrayList<Integer> taulukkoLista = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            taulukkoLista.add(i);
        }
        return taulukkoLista.stream()
                .map(x -> x * x)
                .reduce(0, (acc, x) -> acc + x);

    }

    public static int hidasNelioSumma3(int n) {
        IntStream intsream = IntStream.rangeClosed(1, n);
        return intsream
                .map(x -> x * x)
                .reduce(0, (acc, x) -> acc + x);

    }
}
