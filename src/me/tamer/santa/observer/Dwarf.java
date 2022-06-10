package me.tamer.santa.observer;

import me.tamer.santa.factories.AbstractFactory;
import me.tamer.santa.factories.BikeFactory;
import me.tamer.santa.factories.DollFactory;
import me.tamer.santa.model.Toy;
import me.tamer.santa.singleton.Workshop;


public class Dwarf implements Observer {
    private Observable topic;
    @Override
    public void update() {
        final AbstractFactory factory;
        switch (topic.getState()){
            case "Doll":
                factory = new DollFactory();
                break;
            case "Bike": default:
                factory = new BikeFactory();
                break;
        }

        final Toy builtToy = factory.build();
        Workshop.getInstance().toyCreated(builtToy);
    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;
    }

}