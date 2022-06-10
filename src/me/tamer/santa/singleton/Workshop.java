package me.tamer.santa.singleton;

import me.tamer.santa.model.Toy;

public class Workshop {
    private static Workshop instance;

    private Workshop() {
    }

    public static Workshop getInstance() {
        if (instance == null) {
            instance = new Workshop();
        }
        return instance;
    }


    public void toyCreated(Toy toy) {
        System.out.println("Toy created");
    }

}