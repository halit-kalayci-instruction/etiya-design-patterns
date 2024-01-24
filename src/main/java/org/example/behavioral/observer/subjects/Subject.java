package org.example.behavioral.observer.subjects;

import org.example.behavioral.observer.observers.BaseObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<BaseObserver> subscribers = new ArrayList<>();

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyAllSubscribers();
    }

    public void subscribe(BaseObserver observer)
    {
        subscribers.add(observer);
    }
    public void unsubscribe(BaseObserver observer)
    {
        subscribers.remove(observer);
    }
    public void notifyAllSubscribers() {
        for (BaseObserver subscriber: subscribers) {
            subscriber.update();
        }
    }
}
