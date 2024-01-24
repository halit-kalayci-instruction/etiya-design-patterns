package org.example.behavioral.observer;

import org.example.behavioral.observer.observers.BinaryObserver;
import org.example.behavioral.observer.observers.HexaObserver;
import org.example.behavioral.observer.observers.OctalObserver;
import org.example.behavioral.observer.subjects.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver observer = new BinaryObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        subject.setNumber(10);
        System.out.println("**********");
        subject.setNumber(5);
        System.out.println("**********");
        subject.setNumber(7);
    }
}
