package ru.ragnok123.simpleplugin;

import net.novaplay.bcproxy.plugin.java.JavaPlugin;
import net.novaplay.bcproxy.server.Server;

public class JBMain extends JavaPlugin{
	
	public void onEnable() {
		this.getServer().getLogger().info("I'm enabled");
	}

}
