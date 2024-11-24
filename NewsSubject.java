
public interface NewsSubject {
    void subscribe(SubscriberObserver observer);
    void unsubscribe(SubscriberObserver observer);
    void notifySubscribers(String news);
}