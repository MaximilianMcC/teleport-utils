package net.maxtheminerboy;

import org.bukkit.plugin.java.JavaPlugin;

import net.maxtheminerboy.commands.spawn.SetSpawnCommand;
import net.maxtheminerboy.commands.spawn.SpawnCommand;

public class Main extends JavaPlugin {

	private static Main instance;

	@Override
	public void onEnable() {
		
		// Check for if there is already the needed config files. If not
		// then create them and fill with default information
		instance = this;
		Config.createConfigs();
		

		// Register all the spawn related commands
		getCommand("setspawn").setExecutor(new SetSpawnCommand());
		getCommand("spawn").setExecutor(new SpawnCommand());

		// Register all of the home related commands


		// Register all of the tpa related command




		// Log fancy message
		getLogger().info("Teleport Utils enabled!");
	}

	

	@Override
	public void onDisable() {
		
		// Log fancy message
		getLogger().info("Teleport Utils disabled!");
	}


	public static Main getInstance()
	{
		return instance;
	}
}
