package ObserverPattern.Observable;

import OnserverPattern.Observer.NotificationAlertObserver;

public class IphoneObserverImpl implements StocksObservable {
    public List<NotificatipnAlertObserver> observerList = new ArrayList<>();
    public int stockCount=0;

    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }



}