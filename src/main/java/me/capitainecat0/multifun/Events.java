package me.capitainecat0.multifun;

import me.capitainecat0.multifun.events.Chat;
import me.capitainecat0.multifun.events.ItemsEvents;
import me.capitainecat0.multifun.events.Particles;

public class Events {
    static void init(){
        MultiFun.instance().registerEvent(new Chat());
        MultiFun.instance().registerEvent(new Particles());
        MultiFun.instance().registerEvent(new ItemsEvents());
    }
}
