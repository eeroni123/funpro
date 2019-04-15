package teht5;

public class FactoryProducer {
    public static AbstractMeijeriFactory getFactory(boolean laktoositon){
        if(laktoositon){
            return new LaktoositonFactory();
        }else{
            return new VahalaktoosinenFactory();
        }
    }
}