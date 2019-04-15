package teht6;

public class StructFormat implements FormattingChain {
    private FormattingChain chain;

    @Override
    public void setNextChain(FormattingChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void format(String str) {
        String after = str.replace("sturct", "struct");
        System.out.println(after);
    }
}
