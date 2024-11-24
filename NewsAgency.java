import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsSubject {
    private List<NewsObserver> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(NewsObserver observer) {
        subscribers.add(observer);
        System.out.println("Subscriber added.");
    }

    @Override
    public void unsubscribe(NewsObserver observer) {
        subscribers.remove(observer);
        System.out.println("Subscriber removed.");
    }

    @Override
    public void notifySubscribers(String news) {
        for (NewsObserver observer : subscribers) {
            observer.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("Breaking News: " + news);
        notifySubscribers(news);
    }
}