import me.SkylerTyler1337.kitsplugin.KitsPlugin;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class ArcherCommand implements CommandExecutor {

	public KitsPlugin plugin;

	public ArcherCommand(KitsPlugin instance) {
		return;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandlabel
			,String[] arg3) {
		Player p = (Player) sender;
		if(commandlabel.equalsIgnoreCase("Archer"));
		p.getInventory().clear();
		p.setGameMode(GameMode.SURVIVAL);
		 ItemStack ChainHelmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
         ItemStack ChainChestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
         ItemStack ChainLeggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
         ItemStack ChainBoots = new ItemStack(Material.CHAINMAIL_BOOTS);
         ItemStack Bow = new ItemStack(Material.BOW);
         ItemStack Arrow = new ItemStack(Material.ARROW, 64);
         PlayerInventory pi = p.getInventory();
         p.getInventory().setHelmet(ChainHelmet);
         p.getInventory().setChestplate(ChainChestplate);
         p.getInventory().setLeggings(ChainLeggings);
         p.getInventory().setBoots(ChainBoots);
         pi.setItem(30, Arrow);
         pi.setItem(0, Bow);
         p.sendMessage(ChatColor.GREEN + "Here is your archer kit!");
         return true;
	}
}
