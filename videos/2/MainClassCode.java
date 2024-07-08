package nl.techjunkyben.hire.thebelgiumgamestutorial;

import nl.techjunkyben.hire.thebelgiumgamestutorial.commands.FlyCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Ik ben Op gestart");
        getCommand("fly").setExecutor(new FlyCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Ik ben Uit Gegaan");
    }
}
