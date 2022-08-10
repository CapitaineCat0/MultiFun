package me.capitainecat0.multifun;

import me.capitainecat0.multifun.commands.*;

public class Commands {
    static void init(){
        MultiFun.instance().registerCommand(new Hat(), "hat");
        MultiFun.instance().registerCommand(new LePorte(), "leporte");
        MultiFun.instance().registerCommand(new Lightning(), "lightning");
        MultiFun.instance().registerCommand(new LePioche(), "lepioche");
        MultiFun.instance().registerCommand(new LePe(), "lepe");
        MultiFun.instance().registerCommand(new LeH(), "leh");
        MultiFun.instance().registerCommand(new LeArc(), "learc");
    }
}
