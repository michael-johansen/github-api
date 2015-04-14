package no.ciber.github;

/**
 * User: Michael Johansen
 * Date: 14.04.2015
 * Time: 14:46
 */
public class TextUtil {
    public static boolean hasText(String text) {
        return text != null && !text.matches("^\\s*$");
    }
}
