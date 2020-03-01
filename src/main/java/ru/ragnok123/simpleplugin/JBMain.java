package ru.ragnok123.simpleplugin;

import net.novaplay.bcproxy.event.*;
import net.novaplay.bcproxy.event.player.*;
import net.novaplay.bcproxy.player.Player;
import net.novaplay.bcproxy.plugin.java.JavaPlugin;
import net.novaplay.bcproxy.server.Server;

public class JBMain extends JavaPlugin implements EventListener{
	
	public void onEnable() {
		this.getServer().getLogger().info("I'm enabled");
		this.getServer().getScheduler().scheduleRepeatingTask(new Runnable() {
			public void run() {
				for(Player p : getServer().getOnlinePlayers().values()) {
					p.sendMessage("Your server: " + p.getCurrentServer().getServerId());
				}
			}
		},600*10);
		this.getServer().getPluginManager().registerEvents(this,this);
	}
	
	@EventHandler
	public void join(PlayerLoginEvent event) {
		getServer().getLogger().info("SimplePlugin> Joined new player: " + event.getPlayer().getName());
	}
	
	@EventHandler
	public void leave(PlayerLogoutEvent event) {
		getServer().getLogger().info("SimplePlugin> Left our dear player: " + event.getPlayer().getName());
	}

}
