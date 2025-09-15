package ObserverPattern.Observer;
import ObserverPattern.Observable.StockObservable;

class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.observable = observable;
        this.emailId=emailId;

    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up !");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("Sending email to " + emailId);
    }

}