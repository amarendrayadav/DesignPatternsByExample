package patterns.behaviouralPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean isChanged;

    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void unRegister(Observer observer) {
        synchronized (MUTEX) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        List<Observer> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!isChanged)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.isChanged = false;
        }
        for (Observer obj : observersLocal) {
            obj.update(); //call update for each observer of this topic/subject
        }
    }

    @Override
    public String getUpdate(Observer observer) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic:" + msg);
        this.message = msg;
        this.isChanged = true;
        notifyObserver();
    }
}
