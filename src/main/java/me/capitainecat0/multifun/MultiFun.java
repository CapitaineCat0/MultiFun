package me.capitainecat0.multifun;


public final class MultiFun extends PluginCore<MultiFun> {

    @Override
    protected boolean start(MultiFun instance) {
        Commands.init();
        Events.init();
        return true;
    }

    @Override
    protected void stop() {

    }
}
