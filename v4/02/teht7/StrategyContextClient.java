package teht7;

public class StrategyContextClient {

    public static void main(String[] args) {

        StrategyContext spaces = new StrategyContext((String s) -> s.trim().replaceAll(" +", " "));
        StrategyContext scandis = new StrategyContext((String s) -> s.replace("ä", "a")
                .replace("Ä", "A")
                .replace("Å", "A")
                .replace("å", "a")
                .replace("ö", "o")
                .replace("Ö", "O"));
        StrategyContext structs = new StrategyContext((String s) -> s.replace("sturct", "struct"));


        // Käytetään valmiiksi injektoitua strategiaa:
        String data = "Ön paljon   ääkkösiä   ja    myös välilyöntejä sekä    sturct    sturct";
        System.out.println("Alkuperäinen data: " + data);

        spaces.setData(data);
        spaces.modifyData();
        System.out.println(spaces.getData());

        scandis.setData(spaces.getData());
        scandis.modifyData();
        System.out.println(scandis.getData());

        structs.setData(scandis.getData());
        structs.modifyData();
        System.out.println(structs.getData());


    }


}
