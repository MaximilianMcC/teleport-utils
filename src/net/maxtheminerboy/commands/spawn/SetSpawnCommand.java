package net.maxtheminerboy.commands.spawn;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Location position;

		// Check for if the sender is a player, or the console
		if (sender instanceof Player) {

			// Get the player, and their coordinates
			Player player = ((Player)sender);
			position = player.getLocation();

			// 'clean up' the coordinates
			position.setX(Math.round(position.getX()));
			position.setY(Math.round(position.getY()));
			position.setZ(Math.round(position.getZ()));

			// 'clean up' the direction
			position.setPitch(0);
			position.setYaw(clampYaw(position.getYaw()));

			// End
			return true;

		} else {
			
			// Get the coordinates from the args for the console to use
			if (args.length < 4)
			{
				// Send an error message if insufficient arguments were provided
				sender.sendMessage(ChatColor.RED + "Please use correct arguments.\n" + ChatColor.BLUE + "/setspawn <X> <Y> <Z> <Yaw>");
				return false;
			}
			
			// Get the position from all the args
			position = new Location(Bukkit.getWorlds().get(0), Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Float.parseFloat(args[3]), 0);
		}

		// Add the new position to the config
		

		return false;
	}


	// Clamp a yaw to 90, 0, -90, or 180 to look straight ahead
	private float clampYaw(float yaw)
	{
		float clampedYaw = yaw;

		if (inRange(clampedYaw, -45, 45)) clampedYaw = 0;
		else if (inRange(clampedYaw, 45, 135)) clampedYaw = 90;
		else if (inRange(clampedYaw, 135, 225)) clampedYaw = 180;
		else clampedYaw = -90;

		// Give back the new yaw
		return clampedYaw;
	}

	// Check for if a value is in range
	private boolean inRange(float value, float min, float max)
	{
		return value >= min && value <= max;
	}

}
