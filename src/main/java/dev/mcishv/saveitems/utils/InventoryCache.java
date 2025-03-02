package dev.mcishv.saveitems.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class InventoryCache {
    private static final Map<Player, List<ItemStack>> savedItems = new HashMap<>();
    private static final Map<Player, ItemStack[]> savedArmor = new HashMap<>();
    private static final Map<Player, ItemStack[]> savedOffHand = new HashMap<>();

    public static void saveItems(Player player, List<ItemStack> items, ItemStack[] armor, ItemStack[] offHand) {
        savedItems.put(player, items);
        savedArmor.put(player, armor);
        savedOffHand.put(player, offHand);
    }

    public static List<ItemStack> getSavedItems(Player player) {
        return savedItems.getOrDefault(player, null);
    }

    public static ItemStack[] getSavedArmor(Player player) {
        return savedArmor.getOrDefault(player, null);
    }

    public static ItemStack[] getSavedOffHand(Player player) {
        return savedOffHand.getOrDefault(player, null);
    }

    public static void clearSavedData(Player player) {
        savedItems.remove(player);
        savedArmor.remove(player);
        savedOffHand.remove(player);
    }
}
