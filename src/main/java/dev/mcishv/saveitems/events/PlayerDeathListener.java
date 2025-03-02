package dev.mcishv.saveitems.events;

import dev.mcishv.saveitems.SaveItems;
import dev.mcishv.saveitems.utils.InventoryCache;
import dev.mcishv.saveitems.utils.ItemUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class PlayerDeathListener implements Listener {
    private final SaveItems plugin;

    public PlayerDeathListener(SaveItems plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        List<ItemStack> items = ItemUtils.getItemsToSave(event);
        ItemStack[] armor = player.getInventory().getArmorContents();

        InventoryCache.saveItems(player, items, armor);

        event.getDrops().removeIf(ItemUtils::isToolWeaponOrArmor);
    }
}
