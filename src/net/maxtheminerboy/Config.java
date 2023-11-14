package net.maxtheminerboy;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config {
	
	// Get the main instance to get plugin info
	private static Main plugin = Main.getInstance();


	// Make all of the required configs
	public static void createConfigs() {

		// Load all of the config files
		FileConfiguration config = loadConfigFile("config.yml");
		FileConfiguration spawn = loadConfigFile("spawn.yml");
		FileConfiguration homes = loadConfigFile("homes.yml");
		FileConfiguration tpa = loadConfigFile("tpa.yml");

		
	}
	
	
	private static FileConfiguration loadConfigFile(String fileName) {

		// Get the config
		File configFile = new File(plugin.getDataFolder(), fileName);
		if (!configFile.exists()) {

			// Make the file if it doesn't already exist
			configFile.getParentFile().mkdirs();
			plugin.saveResource(fileName, false);
			plugin.getLogger().info("Created " + fileName);
		}

		// Parse the config file
		FileConfiguration config = new YamlConfiguration();
		try {
			config.load(configFile);
			return config;

		} catch (Exception e) {

			plugin.getLogger().warning("Error while parsing " + fileName);
			return null;
		}
	}


}
