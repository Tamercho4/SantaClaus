package me.tamer.santa.observer;


public interface Observable {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);

    void notifyObservers();

    void requestToy(String toy);

    String getState();
}