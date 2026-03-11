import java.util.HashMap;
import java.util.Map;

public class ArrayBanner {

    // Function to initialize character patterns
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return patternMap;
    }

    // Function to render banner word
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = patternMap.get(word.charAt(0)).length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                line.append(pattern[i]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        renderBanner("OOPS", patternMap);
    }
}