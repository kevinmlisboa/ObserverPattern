
public interface NewsSubject {
    void subscribe(NewsObserver observer);
    void unsubscribe(NewsObserver observer);
    void notifySubscribers(String news);
}