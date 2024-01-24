package org.example.behavioral.observer.observers;

import org.example.behavioral.observer.subjects.Subject;

public class HexaObserver extends BaseObserver{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int number = subject.getNumber();
        System.out.println("Değer değişti, yeni değerin hexa değeri: " + Integer.toHexString(number));
    }
}
