package com.stagoh.kthtech.kthtech;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("kthtech")
public class KthTech {
    private static final Logger LOGGER = LogManager.getLogger();

    public KthTech() {
        LOGGER.info("""

                ##    ## ######## ##     ## ######## ########  ######  ##     ##\s
                ##   ##     ##    ##     ##    ##    ##       ##    ## ##     ##\s
                ##  ##      ##    ##     ##    ##    ##       ##       ##     ##\s
                #####       ##    #########    ##    ######   ##       #########\s
                ##  ##      ##    ##     ##    ##    ##       ##       ##     ##\s
                ##   ##     ##    ##     ##    ##    ##       ##    ## ##     ##\s
                ##    ##    ##    ##     ##    ##    ########  ######  ##     ##\s
                """);
    }
}
