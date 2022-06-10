package me.tamer.santa.factories;

import me.tamer.santa.model.Doll;
import me.tamer.santa.model.Toy;

public class DollFactory extends AbstractFactory {

    @Override
    public Toy build() {
        return new Doll();
    }
}