package me.amc.colorapi;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class ColorAPI {
	
	private JavaPlugin plugin;
	private Logger logger;
	
	public ColorAPI(JavaPlugin plugin) {
		this.plugin = plugin;
		this.logger = this.plugin.getLogger();
	}

	/**
	 * Colors your item if its type is wool or stained_glass or stained_glass_pane
	 * 
	 * @param item : the item that will be colored
	 * @param color : the color of the item
	 */
	public void addColor(ItemStack item, Colors color) {
		
		Material material = item.getType();
		
		if(material == Material.WOOL || material == Material.STAINED_GLASS || material == Material.STAINED_GLASS_PANE) {
			
			item.setDurability((short) color.getId());
			
		} else {
			this.logger.log(Level.WARNING, "This plugin tries to color a non colorable item !!!");
		}
		
	}
	
}
