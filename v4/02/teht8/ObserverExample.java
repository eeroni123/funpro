package teht8;

import java.util.Observable;

public class ObserverExample {

    public static void main(String[] args) {
        IltaSanomat observable = new IltaSanomat(null);
        HelsinginSanomat observable2 = new HelsinginSanomat(null);
        ObserverExample observer = new ObserverExample();
        observable.addObserver((Observable o, Object arg) -> {
            IltaSanomat is = (IltaSanomat) observable;
            System.out.println("Ilta Sanomat:  " + is.getNews());

        });
        observable2.addObserver((Observable o, Object arg) -> {
            HelsinginSanomat hs = (HelsinginSanomat) observable2;
            System.out.println("Helsingin Sanomat:  " + hs.getNews());

        });
        observable.setNews("julkkis sammui keikalle");
        observable2.setNews("politiikka on poliittista");
    }
}
