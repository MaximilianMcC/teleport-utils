package net.maxtheminerboy;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.yaml.snakeyaml.Yaml;

public class Config {
	
	private static Main main = Main.getInstance();

	// Spawn related config files
	private static FileConfiguration spawnConfig;

	// Create missing config files
	public static void createConfigs()
	{
		createSpawnConfig();
	}

	private static void createSpawnConfig()
	{
		// Make a new config file
		spawnConfig = createConfig("spawn.yml");
	}


	// Create a config file if it doesn't exist
	private static FileConfiguration createConfig(String configFileName)
	{
		// Create a new file
		File configFile = new File(main.getDataFolder(), configFileName);
		if (!configFile.exists())
		{
			configFile.getParentFile().mkdirs();
			main.saveResource(configFileName, false);
		}

		// Load the config
		YamlConfiguration config = new YamlConfiguration();
		try {
			config.load(configFile);
			return config;

		} catch (Exception e) {
			main.getLogger().warning("Error while getting config info from" + configFileName);
		}

		return null;
	}

}
