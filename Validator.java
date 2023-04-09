import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    
    private final Pattern pattern;
    private Matcher matcher;
    private final String regex = "([1-9]|10) (\\+|-|/|\\*) ([1-9]|10)";
    
    
    public Validator() {
        pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);
    }
    
    public boolean validate(final String message) {
        matcher = pattern.matcher(message);
        if (matcher.matches()) {
            return true;
        } else {return false;}
    }
}
