package me.tamer.santa.commands;

import me.tamer.santa.observer.MagicBoard;

public class IWantDollCommand implements Command {
    @Override
    public void wantToy() {
        MagicBoard.getInstance().requestToy("Doll");
    }
}