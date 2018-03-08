package de.shydev.betterfarming.storage;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

/**
 * Coded by ShyDev
 * Coded with IntelliJ
 */

public class cfgManager {

    private static File cfgFile = new File("//plugins//BetterFarming//", "config.yml");
    private static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(cfgFile);
    private static File locFile = new File("//plugins//BetterFarming//", "locations.yml");
    private static YamlConfiguration loc = YamlConfiguration.loadConfiguration(locFile);
    private static File tsFile = new File("//plugins//BetterFarming//", "tsbot.yml");
    private static YamlConfiguration tsBot = YamlConfiguration.loadConfiguration(tsFile);
    private static File mySQLFile = new File("//plugins//BetterFarming//", "mysql.yml");
    private static YamlConfiguration mysql = YamlConfiguration.loadConfiguration(mySQLFile);

    public static void load(String state){
        if(state.equalsIgnoreCase("cfg")){
            cfg.addDefault("TSSupport", false);
            cfg.addDefault("MySQLSupport", false);
            cfg.addDefault("Prefix", "§8▌ §6§lBetterFarming §8§l» ");
            cfg.options().copyDefaults(true);
        }
    }

}
