package src.com.dreamysmp.lifesteal;

import src.com.dreamysmp.lifesteal.utils.LiteralText;

public class Helpers {
    public static void registerEvents() {
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            // Example event registration
            for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                player.sendMessage(new LiteralText("Welcome to the Lifesteal Mod!"), false);
            }
        });

        // Register other events here
    }

    // TODO
}
