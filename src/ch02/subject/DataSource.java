package ch02.subject;

import ch02.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 胡宇靖 on 2019/3/21.
 */
public class DataSource implements ISubject {
    private List<IObserver> observers = new ArrayList<>();
    private String Information;

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (observers.indexOf(observer) >= 0)
            observers.remove(observer);
    }

    /**
     * 达到一定的条件时,执行setChanged打开发送广播的开关
     * 防止频繁
     */
    private boolean changed;

    private void setChanged() {
        changed = true;
    }

    @Override
    public void notifyObservers() {
        if (changed) {
            for (IObserver observer : observers) {
                observer.update(Information);
            }
            changed = false;
        }
    }

    public void InformationChanged() {
        notifyObservers();
    }

    public void setInformation(String Information) {
        this.Information = Information;
        setChanged();
        InformationChanged();
    }
}
