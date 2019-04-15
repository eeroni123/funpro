package teht6;

public class ChainOfResponsibility {

    private FormattingChain c1;

    public ChainOfResponsibility() {
        // initialize the chain
        this.c1 = new SpaceFormat();
        FormattingChain c2 = new ScandiFormat();
        FormattingChain c3 = new StructFormat();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ChainOfResponsibility chainofresp = new ChainOfResponsibility();
            // process the request
        String text = "Ön paljon   ääkkösiä   ja    myös välilyöntejä sekä    sturct    sturct";
        System.out.println(text);
        chainofresp.c1.format(text);
        }

    }

