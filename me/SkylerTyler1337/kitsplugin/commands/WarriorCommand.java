import me.SkylerTyler1337.kitsplugin.KitsPlugin;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class WarriorCommand implements CommandExecutor {
	

	public KitsPlugin plugin;

	public WarriorCommand(KitsPlugin instance) {
		return;
	}

	public boolean onCommand(CommandSender sender, Command cmd ,String CommandLabel, String[] args) {
	     Player p = (Player) sender;
	            if(CommandLabel.equalsIgnoreCase("Warrior"))
	                    p.getInventory().clear();
	                    p.setGameMode(GameMode.SURVIVAL);
	                    ItemStack IronHelmet = new ItemStack(Material.IRON_HELMET, 1);
	                    ItemStack IronChestplate = new ItemStack(Material.IRON_CHESTPLATE, 1);
	                    ItemStack IronLeggings = new ItemStack(Material.IRON_LEGGINGS);
	                    ItemStack IronBoots = new ItemStack(Material.IRON_BOOTS);
	                    ItemStack IronSword1 = new ItemStack(Material.IRON_SWORD);
	     	            IronHelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                    IronChestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                    IronLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                    IronBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                    IronBoots.addEnchantment(Enchantment.PROTECTION_FALL, 3);
	                    PlayerInventory pi = p.getInventory();
	                    p.getInventory().setHelmet(IronHelmet);
	                    p.getInventory().setChestplate(IronChestplate);
	                    p.getInventory().setLeggings(IronLeggings);
	                    p.getInventory().setBoots(IronBoots);
	                    pi.setItem(0, IronSword1);
	                    p.sendMessage(ChatColor.RED+"Here is your Warrior kit!");
	                    return true;
	    }
}
