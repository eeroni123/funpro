package teht8;

import java.util.Observable;

public class HelsinginSanomat extends Observable {
    private String news;

    public HelsinginSanomat(String news)
    {
        this.news = news;
    }

    public String getNews()
    {
        return news;
    }

    public void setNews(String news)
    {
        if (news.contains("politiikka"))
        this.news = news;
        setChanged();
        notifyObservers();
    }


}
