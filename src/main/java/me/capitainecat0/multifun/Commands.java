package me.capitainecat0.multifun;

import me.capitainecat0.multifun.commands.Hat;
import me.capitainecat0.multifun.commands.LePorte;
import me.capitainecat0.multifun.commands.Lightning;

public class Commands {
    static void init(){
        MultiFun.instance().registerCommand(new Hat(), "hat");
        MultiFun.instance().registerCommand(new LePorte(), "leporte");
        MultiFun.instance().registerCommand(new Lightning(), "lightning");
    }
}
