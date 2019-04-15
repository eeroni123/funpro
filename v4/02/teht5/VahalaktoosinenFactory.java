package teht5;

public class VahalaktoosinenFactory extends AbstractMeijeriFactory {
    @Override
    Maitotuote getMaitotuote(String tuotenimi) {
        if (tuotenimi.equalsIgnoreCase("MAITO")) {
            return new VahalaktoosinenMaito();
        } else if (tuotenimi.equalsIgnoreCase("JUUSTO")) {
            return new VahalaktoosinenJuusto();
        } else if (tuotenimi.equalsIgnoreCase("JUGURTTI")) {
            return new VahalaktoosinenJugurtti();
        } else {
            return null;
        }
    }
}
