package teht4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Omena o1 = new Omena("vihreä", 100);
        Omena o2 = new Omena("vihreä", 110);
        Omena o3 = new Omena("punainen", 101);
        Omena o4 = new Omena("punainen", 105);

        List<Omena> omenat = new ArrayList<>();

        omenat.add(o1);
        omenat.add(o2);
        omenat.add(o3);
        omenat.add(o4);


        List<Omena> omenaLista = omenat.stream().collect(
                ArrayList::new,
                List::add,
                List::addAll);

        omenaLista.forEach(System.out::println);
    }
}
