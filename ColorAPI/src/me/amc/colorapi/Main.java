package me.amc.colorapi;

import java.util.logging.Level;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		if(!this.isEnabled()) return;
		
		for(Plugin plugin : this.getServer().getPluginManager().getPlugins()) {
			if(plugin.getDescription().getDepend().contains("ColorAPI")) {
				if(plugin.isEnabled()) {
					this.getLogger().log(Level.INFO, "Successfully hooked "+plugin.getDescription().getName()+" !");
				}
			}
		}
		
		this.getLogger().log(Level.INFO, "Successfully enabled "+this.getDescription().getName()+" v"+this.getDescription().getVersion()+" !");
		
	}
	
	@Override
	public void onDisable() {
		this.getLogger().log(Level.INFO, "Successfully disabled "+this.getDescription().getName()+" v"+this.getDescription().getVersion()+" !");
	}
	
}
