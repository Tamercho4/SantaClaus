package me.tamer.santa.commands;

import me.tamer.santa.observer.MagicBoard;

public class IWantBikeCommand implements Command {
    @Override
    public void wantToy() {
        MagicBoard.getInstance().requestToy("Bike");
    }
}