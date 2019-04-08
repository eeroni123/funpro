import java.util.function.DoubleUnaryOperator;

public class teht2 {

    static DoubleUnaryOperator makePistelaskuri(double kPiste, double lisapisteet) {
        return hypynpituus -> {
            double pisteet = (hypynpituus - kPiste) * lisapisteet;
            return 60 + pisteet;
        };
    }

    public static void main(String[] args) {


        DoubleUnaryOperator normaaliLahti = makePistelaskuri(90, 1.8);

        System.out.println(normaaliLahti.applyAsDouble(100));

    }

}