package teht6;

public class ScandiFormat implements FormattingChain {
    private FormattingChain chain;

    @Override
    public void setNextChain(FormattingChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void format(String str) {
        String after = str.replace("ä", "a")
                .replace("Ä", "A")
                .replace("Å", "A")
                .replace("å", "a")
                .replace("ö", "o")
                .replace("Ö", "O");
        System.out.println(after);
        this.chain.format(after);

    }
}
