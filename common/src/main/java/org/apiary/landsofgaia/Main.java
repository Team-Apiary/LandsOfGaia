package org.apiary.landsofgaia;

import org.apiary.landsofgaia.platform.Services;

public class Main {

    public static void init() {

        //Constants.LOG.info("Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());

        if (Services.PLATFORM.isModLoaded("landsofgaia")) {

            Constants.LOG.info("{} Detected, Initializing Lands Of Gaia", Services.PLATFORM.getPlatformName());
        }
    }
}