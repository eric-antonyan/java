package modules;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Colored {
    private static final String RESET = "\033[0m";
    private static final String RED = "\033[0;31m";
    private static final String GREEN = "\033[0;32m";
    private static final String YELLOW = "\033[0;33m";
    private static final String BLUE = "\033[0;34m";
    private static final String MAGENTA = "\033[0;35m";
    private static final String CYAN = "\033[0;36m";
    private static final String WHITE = "\033[0;37m";

    private static final Map<String, String> colorMap = new HashMap<>();

    public ArrayList<String> colors = new ArrayList<>();

    static {
        colorMap.put("RED", RED);
        colorMap.put("GREEN", GREEN);
        colorMap.put("YELLOW", YELLOW);
        colorMap.put("BLUE", BLUE);
        colorMap.put("MAGENTA", MAGENTA);
        colorMap.put("CYAN", CYAN);
        colorMap.put("WHITE", WHITE);
    }

    public ArrayList<String> getColors() {
        colors.add("RED");
        colors.add("GREEN");
        colors.add("YELLOW");
        colors.add("BLUE");
        colors.add("MAGENTA");
        colors.add("CYAN");
        colors.add("GREEN");
        colors.add("GREEN");
        colors.add("WHITE");

        return colors;
    }

    public String colorize(String color, String content) {
        String colorCode = colorMap.getOrDefault(color.toUpperCase(), RESET);
        return colorCode + content + RESET;
    }
}
