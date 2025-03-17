package org.example.ObservablePattern.Observable;

import org.example.ObservablePattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {
    public int stockCount=0;
    public List<NotificationAlertObserver>observerList=new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded){
        if(stockCount==0){
            notifyObservers();
        }
        stockCount=stockCount+newStockAdded;
    }

    @Override
    public int getStockCount(){
        return stockCount;
    }
}
