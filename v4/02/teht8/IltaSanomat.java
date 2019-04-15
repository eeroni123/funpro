package teht8;


import java.util.Observable;

public class IltaSanomat extends Observable {
    private String news;

    public IltaSanomat(String news)
    {
        this.news = news;
    }

    public String getNews()
    {
        return news;
    }

    public void setNews(String news)
    {
        if (news.contains("julkkis"))
        this.news = news;
        setChanged();
        notifyObservers();
    }
}
