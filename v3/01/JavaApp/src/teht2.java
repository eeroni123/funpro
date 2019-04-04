import menu.Dish;
import streams.Trader;
import streams.Transaction;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class teht2 {


    public static void main(String args[]) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> tr2012 = transactions.stream()
                .filter(transaction -> transaction.getYear() > 2012 && transaction.getValue() > 900)
                .collect(toList());
        System.out.println(tr2012);

        List<Dish> dishes = Dish.menu;

        int count = dishes.stream()
                .map(dish -> dish.getName() == null ? 0 : 1)
                .reduce(0, Integer::sum);
        System.out.println(count);


    }
}
