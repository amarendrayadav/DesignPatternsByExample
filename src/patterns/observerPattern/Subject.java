package patterns.observerPattern;

public interface Subject {
    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyObserver();

    Object getUpdate(Observer observer);
}
