package src.com.dreamysmp.lifesteal.utils;

public class GlobalState {
    private static boolean maceCrafted = false;

    public static boolean isMaceCrafted() {
        return maceCrafted;
    }

    public static void setMaceCrafted(boolean value) {
        maceCrafted = value;
    }
}
