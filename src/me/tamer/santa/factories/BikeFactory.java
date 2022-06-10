package me.tamer.santa.factories;

import me.tamer.santa.model.Bike;
import me.tamer.santa.model.Toy;

public class BikeFactory extends AbstractFactory {

    @Override
    public Toy build() {
        return new Bike();
    }
}