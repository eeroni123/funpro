import java.util.function.IntSupplier;

public class teht1 {

    public static void main(String args[]) {
        IntSupplier generaattori1 = () -> 3;
        IntSupplier generaattori2 = () -> (int) (Math.random() * 6 + 1);


        System.out.println(generaattori1.getAsInt());
        System.out.println(generaattori2.getAsInt());
    }
}
