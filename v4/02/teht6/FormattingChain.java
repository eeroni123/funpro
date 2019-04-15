package teht6;

public interface FormattingChain {

    void setNextChain(FormattingChain nextChain);

    void format(String str);
}
