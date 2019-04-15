package teht5;

public class LaktoositonFactory extends AbstractMeijeriFactory {
    @Override
    Maitotuote getMaitotuote(String tuotenimi) {
        if (tuotenimi.equalsIgnoreCase("MAITO")) {
            return new LaktoositonMaito();
        } else if (tuotenimi.equalsIgnoreCase("JUUSTO")) {
            return new LaktoositonJuusto();
        } else if (tuotenimi.equalsIgnoreCase("JUGURTTI")) {
            return new LaktoositonJugurtti();
        } else {
            return null;
        }
    }
}
