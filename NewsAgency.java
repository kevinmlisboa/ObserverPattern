import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsSubject {
    private List<SubscriberObserver> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(SubscriberObserver observer) {
        subscribers.add(observer);
        System.out.println("Subscriber added.");
    }

    @Override
    public void unsubscribe(SubscriberObserver observer) {
        subscribers.remove(observer);
        System.out.println("Subscriber removed.");
    }

    @Override
    public void notifySubscribers(String news) {
        for (SubscriberObserver observer : subscribers) {
            observer.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("Breaking News: " + news);
        notifySubscribers(news);
    }
}