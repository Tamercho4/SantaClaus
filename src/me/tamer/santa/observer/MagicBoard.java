package me.tamer.santa.observer;

import java.util.LinkedList;
import java.util.List;

public class MagicBoard implements Observable{

    private static MagicBoard instance;
    private final List<Observer> subscribers = new LinkedList<>();
    private String state;

    private MagicBoard() {
    }

    public static MagicBoard getInstance() {
        if (instance == null) {
            instance = new MagicBoard();
        }
        return instance;
    }

    @Override
    public void subscribe(Observer observer) {
        if(subscribers.contains(observer)){
            return;
        }
        subscribers.add(observer);
        observer.setTopic(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update();
        }
    }

    @Override
    public void requestToy(String toy) {
        this.state = toy;
        notifyObservers();
    }

    public String getState() {
        return state;
    }

}