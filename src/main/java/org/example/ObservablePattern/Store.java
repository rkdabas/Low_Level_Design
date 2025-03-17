package org.example.ObservablePattern;

import org.example.ObservablePattern.Observable.IphoneObservable;
import org.example.ObservablePattern.Observable.StockObservable;
import org.example.ObservablePattern.Observer.EmailAlertObserver;
import org.example.ObservablePattern.Observer.MobileAlertObserver;
import org.example.ObservablePattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String args[]){
        StockObservable iphoneStockObserable=new IphoneObservable();

        NotificationAlertObserver observer1=new EmailAlertObserver("abc@gmail.com",iphoneStockObserable);
        NotificationAlertObserver observer2=new MobileAlertObserver("9013503195",iphoneStockObserable);

        iphoneStockObserable.add(observer1);
        iphoneStockObserable.add(observer2);

        iphoneStockObserable.setStockCount(0);
    }
}
