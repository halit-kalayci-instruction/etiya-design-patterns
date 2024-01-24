package org.example.behavioral.observer.observers;

import org.example.behavioral.observer.subjects.Subject;

public abstract class BaseObserver
{
    protected Subject subject;
    public abstract void update();
}
