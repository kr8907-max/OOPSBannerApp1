/**
 * UC3 - OOPS ASCII Banner using String.join()
 * Refactored to improve memory efficiency
 */

public class OOPSBannerApp_UC3 {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " *****  ",
                " *****  ",
                " *****  ",
                " *****  "
        ));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*       "
        ));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*       "
        ));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*****   ",
                " *****  "
        ));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "      * "
        ));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*       ",
                "      * "
        ));

        System.out.println(String.join(" ",
                " *****  ",
                " *****  ",
                "*       ",
                " *****  "
        ));
    }
}