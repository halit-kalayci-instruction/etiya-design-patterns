package org.example.behavioral.observer.observers;

import org.example.behavioral.observer.subjects.Subject;

public class OctalObserver extends BaseObserver{
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int number = subject.getNumber();
        System.out.println("Değer değişti, yeni değerin octal değeri: " + Integer.toOctalString(number));
    }
}
