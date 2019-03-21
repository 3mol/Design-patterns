package ch02.subject;

import ch02.observer.IObserver;

/**
 * Created by 胡宇靖 on 2019/3/21.
 */
public interface ISubject {
    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
