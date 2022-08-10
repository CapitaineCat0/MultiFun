package me.capitainecat0.multifun;

public final class MultiFun extends PluginCore<MultiFun> {

    private static MultiFun instance;
    @Override
    protected boolean start(MultiFun instance) {
        Commands.init();
        Events.init();
        return true;
    }

    @Override
    protected void stop() {

    }

    public static MultiFun getInstance(){
        return instance;
    }
}
