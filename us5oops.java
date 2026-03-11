public class OopsBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {
        // Defining the rows using String.join to avoid repeated '+' overhead
        String row1 = String.join("  ", " OOO ", " OOO ", "PPPP ", " SSSS");
        String row2 = String.join("  ", "O   O", "O   O", "P   P", "S    ");
        String row3 = String.join("  ", "O   O", "O   O", "PPPP ", " SSS ");
        String row4 = String.join("  ", "O   O", "O   O", "P    ", "    S");
        String row5 = String.join("  ", " OOO ", " OOO ", "P    ", "SSSS ");

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
    }
}