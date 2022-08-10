package me.capitainecat0.multifun;

import me.capitainecat0.multifun.commands.Lightning;
import me.capitainecat0.multifun.events.*;

public class Events {
    static void init(){
        MultiFun.instance().registerEvent(new Chat());
        //MultiFun.instance().registerEvent(new Particles());
        //MultiFun.instance().registerEvent(new ItemsEvents());
        //MultiFun.instance().registerEvent(new Lightning());
        MultiFun.instance().registerEvent(new FuzeEvent());
        MultiFun.instance().registerEvent(new EnderPearlVehicle());
        MultiFun.instance().registerEvent(new TNTEvent());
    }
}
