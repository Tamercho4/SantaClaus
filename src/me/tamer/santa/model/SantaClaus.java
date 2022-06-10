package me.tamer.santa.model;

import me.tamer.santa.commands.IWantBikeCommand;
import me.tamer.santa.commands.IWantDollCommand;

public class SantaClaus {

    private static SantaClaus instance;

    private SantaClaus() {
    }

    public static SantaClaus getInstance() {
        if (instance == null) {
            instance = new SantaClaus();
        }
        return instance;
    }

    public void iWantToys() {
        new IWantBikeCommand().wantToy();
        new IWantBikeCommand().wantToy();
        new IWantBikeCommand().wantToy();
        new IWantDollCommand().wantToy();
        new IWantDollCommand().wantToy();
        new IWantDollCommand().wantToy();
    }

}