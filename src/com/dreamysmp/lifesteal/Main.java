package src.com.dreamysmp.lifesteal;

public class Main {
    public static void main(String[] args) {
        // Load configuration
        Config.loadConfig();

        // Register events
        Helpers.registerEvents();

        // Initialization code for the Lifesteal mod
        System.out.println("Lifesteal Mod Initialized");
    }
}
