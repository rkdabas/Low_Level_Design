package org.example.ObservablePattern.Observable;
import org.example.ObservablePattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyObservers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
