public class OopsBanner {
    public static void main(String[] args) {
        
        // Define the delimiter/spacer between each letter in the banner
        String spacer = "   ";
        
        // Constructing each line using String.join() to optimize memory
        // Layout maps to: O, O, P, S
        String line1 = String.join(spacer, "***", "***", "***", "***");
        String line2 = String.join(spacer, "* *", "* *", "* *", "* ");
        String line3 = String.join(spacer, "* *", "* *", "***", "***");
        String line4 = String.join(spacer, "* *", "* *", "* ", "  *");
        String line5 = String.join(spacer, "***", "***", "* ", "***");
        
        // Render the banner to the console
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}