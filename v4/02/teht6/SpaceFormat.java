package teht6;

public class SpaceFormat implements FormattingChain {
    private FormattingChain chain;

    @Override
    public void setNextChain(FormattingChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void format(String str) {
        String after = str.trim().replaceAll(" +", " ");
        System.out.println(after);
        this.chain.format(after);
    }
}
