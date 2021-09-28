package me.alex.firstplugin;

import org.bukkit.Location;
import org.bukkit.TreeType;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ArrowHit implements Listener {
    @EventHandler
    public void hit(ProjectileHitEvent e) {
        if(e.getEntity() instanceof Arrow && e.getEntity().getShooter() instanceof Player) {
            Arrow a = (Arrow) e.getEntity();
            Player s = (Player) a.getShooter();
            Location location = a.getLocation();
            World world = location.getWorld();
            world.strikeLightning(location);
            world.generateTree(location, TreeType.TREE);

        }
    }
}
