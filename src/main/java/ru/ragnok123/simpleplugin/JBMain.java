package ru.ragnok123.simpleplugin;

import net.novaplay.jbproxy.plugin.java.JavaPlugin;

public class JBMain extends JavaPlugin{
	
	public void onEnable() {
		this.getServer().getLogger().info("I'm enabled");
	}

}
