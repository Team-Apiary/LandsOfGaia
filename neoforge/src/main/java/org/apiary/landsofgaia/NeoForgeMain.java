package org.apiary.landsofgaia;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NeoForgeMain {

    public NeoForgeMain(IEventBus eventBus) {

        Main.init();

    }
}