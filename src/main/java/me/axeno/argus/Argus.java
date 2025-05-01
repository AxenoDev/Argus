package me.axeno.argus;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Argus extends JavaPlugin {

    @Getter
    public static Argus instance;
    public static Logger logger = Logger.getLogger("Argus");

    @Override
    public void onEnable() {
        instance = this;
        logger.info("Argus has been enabled!");
    }

    @Override
    public void onDisable() {
        logger.info("Argus has been disabled!");
    }
}
