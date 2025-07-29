package com.author.BetaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class BetaPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BetaPlugin ativado!");

        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.getWorld().spawnParticle(
                            // Tipo de partícula
                            Particle.DRIPPING_LAVA,
                            // Posição
                            player.getLocation().add(0, 1, 0),
                            // quantidade, spread X/Y/Z, speed
                            10, 0.3, 0.5, 0.3, 1.0
                    );
                }
            }
        }.runTaskTimer(this, 0L, 5L);
    }

    @Override
    public void onDisable() {
        getLogger().info("partícula desativada.");
    }
}

