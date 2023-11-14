# Teleport Utils
![Minecraft Server Version](https://img.shields.io/badge/Minecraft%20Version-1.20.1-36b32d?style=for-the-badge)

![Bukkit](https://img.shields.io/badge/Bukkit-0c64ae?style=for-the-badge)
![Spigot](https://img.shields.io/badge/Spigot-ef9228?style=for-the-badge)
![Paper](https://img.shields.io/badge/Paper-181a1b?style=for-the-badge)

---

Minecraft plugin that adds `/spawn`, `/home`, and `/tpa` commands to your server.

---
## Spawn Commands
| Command Name                  | Function                               | Example     | Implemented |
|-------------------------------|----------------------------------------|-------------|-------------|
| `/spawn` | Teleports the player to spawn          | `/spawn`    | ❌ |
| `/setspawn` | Sets the spawn at the players position | `/setspawn` | ❌ |
| `setspawn <x> <y> <z> <yaw>` | Sets the spawn at the provided position (only available in the console) | `setspawn 0 60 0 180` | ❌ |
| `/spawnhelp` | Shows a list of spawn related commands | `/spawnhelp` | ❌ |

## Home commands
| Command Name                  | Function                               | Example     | Implemented |
|-------------------------------|----------------------------------------|-------------|-------------|
| `/sethome` | Sets the players main home to their current position | `/sethome` | ❌ |
| `/sethome <home name>` | Sets a named home at the players current position | `/sethome farm` | ❌ |
| `/homes` | Lists all of the homes, and their coordinates, that the player has | `/homes` | ❌ |
| `/home` | Teleports the player to their main home | `/home` | ❌ |
| `/home <home name>` | Teleports the player to the named home | `/home farm` | ❌ |
| `/sharehome <home name> <player>` | Add one of your homes to another players homes list | `/sharehome farm steve` | ❌ |
| `/delhome` | Remove the players main home | `/delhome` | ❌ |
| `/delhome <home name>` | Remove one of the players named homes | `/delhome farm` | ❌ |
| `/homehelp` | Shows a list of home related commands | `/homehelp` | ❌ |

## TPA commands
| Command Name                  | Function                               | Example     | Implemented |
|-------------------------------|----------------------------------------|-------------|-------------|
| `/tpa <player>` | Ask if you can teleport to the player | `/tpa steve` | ❌ |
| `/tpahere <player>` | Ask the player if they can teleport to you | `/tpahere steve` | ❌ |
| `/tpaccept` | Accept the an incoming teleport request | `/tpaccept` | ❌ |
| `/tpaccept <player>` | Accept the an incoming teleport request from a specific person (Useful for if more than one person is sending you a request) | `/tpaccept steve` | ❌ |
| `/tpadeny` | Deny the incoming teleport request | `/tapdeny` | ❌ |
| `/tpadeny <player>` | Deny the incoming teleport request from a specific person (Useful for if more than one person is sending you a request) | `/tapdeny steve` | ❌ |
| `/tpahelp` | Shows a list of tpa related commands | `/tpahelp` | ❌ |

---

# Help/feature request
If you encounter a problem, need help, or want to request a feature, please either Discord me: `@mtmb`, or make a GitHub issue on this Repository.