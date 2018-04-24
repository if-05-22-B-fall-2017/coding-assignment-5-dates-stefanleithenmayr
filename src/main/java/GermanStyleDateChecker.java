import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        return Pattern.compile("^([12]?\\d|3[01]|\\d)[- .](0?\\d|1[0-2])[- .](19|20)?\\d{2}$").matcher(dateString);
    }
}
