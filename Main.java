public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Subscriber sub1 = new Subscriber("Alice");
        Subscriber sub2 = new Subscriber("Bob");
        Subscriber sub3 = new Subscriber("Charlie");
        agency.subscribe(sub1);
        agency.subscribe(sub2);
        agency.publishNews("New Java release is out!");
        agency.unsubscribe(sub1);
        agency.subscribe(sub3);
        agency.publishNews("Breaking: Observer Pattern simplifies design!");
    }
}