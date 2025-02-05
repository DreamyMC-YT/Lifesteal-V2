package src.com.dreamysmp.lifesteal.utils;

// Import necessary classes from the mod
import src.com.dreamysmp.lifesteal.utils.LiteralText;
import src.com.dreamysmp.lifesteal.utils.EntityAttributes;
import src.com.dreamysmp.lifesteal.utils.ServerPlayerEntity;
import src.com.dreamysmp.lifesteal.utils.EntityAttributeInstance;

public class HealthManager {
    private final ServerPlayerEntity player;
    private final int maxHeartCap;

    public HealthManager(ServerPlayerEntity player, int maxHeartCap) {
        this.player = player;
        this.maxHeartCap = maxHeartCap * 2; // Convert hearts to health points
    }

    public void addHeart() {
        float maxHealth = player.getMaxHealth();
        if (maxHealth >= maxHeartCap) {
            player.sendMessage(new LiteralText("You are at max health!"), false);
        } else {
            EntityAttributeInstance attributeInstance = player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
            if (attributeInstance != null) {
                attributeInstance.setBaseValue(maxHealth + 2); // Add one heart (2 health points)
                player.setHealth(Math.min(player.getHealth() + 2, player.getMaxHealth())); // Heal the player by one heart, but not above max health
            }
        }
    }

    public ServerPlayerEntity getPlayer() {
        return player;
    }
}