import me.SkylerTyler1337.kitsplugin.*;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KitsCommand implements CommandExecutor {


	public KitsCommand(KitsPlugin instance) {
		return;
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String CommandLabel,
			String[] arg3) {
		if(CommandLabel.equalsIgnoreCase("kits"));
		Player p = (Player) sender;
	    p.sendMessage(ChatColor.GREEN+"========="+ChatColor.BOLD+ChatColor.RED+" Kits Help "+ChatColor.GREEN+"=========");
		p.sendMessage(ChatColor.GRAY+"/Archer ");
		p.sendMessage(ChatColor.GRAY+"/Warrior");
		p.sendMessage(ChatColor.GRAY+"/Heavy");
		p.sendMessage(ChatColor.GRAY+"/Heal");	
		return false;
	}

}
