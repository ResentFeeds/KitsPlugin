import me.SkylerTyler1337.kitsplugin.commands.ArcherCommand;
import me.SkylerTyler1337.kitsplugin.commands.HeavyCommand;
import me.SkylerTyler1337.kitsplugin.commands.KitsCommand;
import me.SkylerTyler1337.kitsplugin.commands.WarriorCommand;

import org.bukkit.plugin.java.JavaPlugin;

public class KitsPlugin extends JavaPlugin{

	
	@Override
	public void onDisable() {
		 System.out.println("[KitsPlugin] Disabled!");
		 this.getCommand("Kits").setExecutor(new KitsCommand(this));
		 this.getCommand("Warrior").setExecutor(new WarriorCommand(this));
		this.getCommand("Archer").setExecutor(new ArcherCommand(this));
	        this.getCommand("Heavy").setExecutor(new HeavyCommand(this));
	}
	
	@Override
	public void onEnable() {
	  System.out.println("[KitsPlugin] Enabled!");
	}

}
