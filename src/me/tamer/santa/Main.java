package me.tamer.santa;

import me.tamer.santa.observer.Dwarf;
import me.tamer.santa.observer.MagicBoard;
import me.tamer.santa.model.SantaClaus;

public class Main {
    public static void main(String[] args) {
        final SantaClaus santaClaus = SantaClaus.getInstance();
        final MagicBoard magicBoard = MagicBoard.getInstance();

        final Dwarf dwarf1 = new Dwarf();
        final Dwarf dwarf2 = new Dwarf();
        final Dwarf dwarf3 = new Dwarf();

        magicBoard.subscribe(dwarf1);
        magicBoard.subscribe(dwarf2);
        magicBoard.subscribe(dwarf3);

        santaClaus.iWantToys();
    }
}
