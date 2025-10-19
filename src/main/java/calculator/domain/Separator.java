package calculator.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Separator {
    private static final Pattern CUSTOM_PATTERN = Pattern.compile("//(.)\n(.*)");
    private static final String DEFAULT_DELIMITERS = "[,:]";

    public String[] split(String text) {
        if (text == null || text.trim().isEmpty()) {
            return new String[0];
        }
        Matcher m = CUSTOM_PATTERN.matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(Pattern.quote(customDelimiter));
        }
        return text.split(DEFAULT_DELIMITERS);
    }
}
