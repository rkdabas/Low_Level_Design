package org.example.ObservablePattern.Observer;

import org.example.ObservablePattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
    String mailId;
    StockObservable observable;

    public EmailAlertObserver(String mailId,StockObservable observable){
        this.observable=observable;
        this.mailId=mailId;
    }

    @Override
    public void update(){
        sendMail(mailId,"product is in stock hurry up");
    }

    private void sendMail(String mailId,String msg){
        System.out.println("mail is sent to: "+mailId);
    }

}
