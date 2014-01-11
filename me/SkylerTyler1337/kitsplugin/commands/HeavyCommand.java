import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import me.SkylerTyler1337.kitsplugin.*;

public class HeavyCommand implements CommandExecutor {

	public KitsPlugin plugin;
	public HeavyCommand(KitsPlugin instance) {
		return;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] arg3) {
		Player p = (Player) sender;
		if(label.equalsIgnoreCase("Heavy"));
		p.getActivePotionEffects().clear();
		p.getInventory().clear();
		p.setGameMode(GameMode.SURVIVAL);
		 ItemStack DiamondHelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
         ItemStack DiamondChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
         ItemStack DiamondLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
         ItemStack DiamondBoots = new ItemStack(Material.DIAMOND_BOOTS);
         ItemStack DiamondSword = new ItemStack(Material.DIAMOND_SWORD);   
         PlayerInventory pi = p.getInventory();
         p.getInventory().setHelmet(DiamondHelmet);
         p.getInventory().setChestplate(DiamondChestplate);
         p.getInventory().setLeggings(DiamondLeggings);
         p.getInventory().setBoots(DiamondBoots);
         pi.setItem(0, DiamondSword);
         p.sendMessage(ChatColor.AQUA+"Here is your Heavy Kit");
		return false;
	}
}
