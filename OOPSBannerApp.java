/*
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * Using String.join() instead of + operator
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Each println prints one row of the banner
        // Letters: O  O  P  S

        System.out.println(String.join(" ",
                "  ***  ", "  ***  ", " ***** ", " ***** "));

        System.out.println(String.join(" ",
                " *   * ", " *   * ", " *   * ", " *     "));

        System.out.println(String.join(" ",
                "*     *", "*     *", " *   * ", " *     "));

        System.out.println(String.join(" ",
                "*     *", "*     *", " ***** ", " ***** "));

        System.out.println(String.join(" ",
                "*     *", "*     *", " *     ", "     * "));

        System.out.println(String.join(" ",
                " *   * ", " *   * ", " *     ", "     * "));

        System.out.println(String.join(" ",
                "  ***  ", "  ***  ", " *     ", " ***** "));
    }
}