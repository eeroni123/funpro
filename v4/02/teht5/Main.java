package teht5;

public class Main {
    public static void main(String[] args) {

        AbstractMeijeriFactory meijeriFactory = FactoryProducer.getFactory(false);

        Maitotuote vahlakmaito = meijeriFactory.getMaitotuote("maito");

        vahlakmaito.tulosta();

        Maitotuote vahlakjuusto = meijeriFactory.getMaitotuote("juusto");

        vahlakjuusto.tulosta();

        //tehtaan vaihto
        meijeriFactory = FactoryProducer.getFactory(true);

        Maitotuote lakjugurtti = meijeriFactory.getMaitotuote("jugurtti");

        lakjugurtti.tulosta();

        Maitotuote lakjuusto = meijeriFactory.getMaitotuote("juusto");

        lakjuusto.tulosta();
    }
}
