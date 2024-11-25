public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Subscriber sub1 = new Subscriber("Kevin");
        Subscriber sub2 = new Subscriber("Ros");
        Subscriber sub3 = new Subscriber("Lisboa");
        agency.subscribe(sub1);
        agency.subscribe(sub2);
        agency.publishNews("New Java release is out!");
        agency.unsubscribe(sub1);
        agency.subscribe(sub3);
        agency.publishNews("Breaking: Observer Pattern simplifies design!");
    }
}