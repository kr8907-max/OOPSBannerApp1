public class OOPSBannerApp_UC4 {

    public static void main(String[] args) {

        // Storing banner lines inside String array
        String[] banner = {
            String.join("    ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("    ", "*     *", "*     *", "*     *", "*      "),
            String.join("    ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("    ", "*     *", "*     *", "*      ", "      *"),
            String.join("    ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Printing using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}