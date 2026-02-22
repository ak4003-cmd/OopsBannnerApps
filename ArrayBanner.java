public class OopsBanner {
    public static void main(String[] args) {
        
        // Define the delimiter/spacer between each letter
        String spacer = "   ";
        
        // Populate the String array with the banner lines using String.join()
        String[] bannerLines = {
            String.join(spacer, "***", "***", "***", "***"),
            String.join(spacer, "* *", "* *", "* *", "* "),
            String.join(spacer, "* *", "* *", "***", "***"),
            String.join(spacer, "* *", "* *", "* ", "  *"),
            String.join(spacer, "***", "***", "* ", "***")
        };
        
        // Use an enhanced for-loop to iterate through the array and render the banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}