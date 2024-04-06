package StringUtils;

import java.util.List;

public class StringUtils {
    public static String join(List<String> strings, String separator) {
        if (strings == null || strings.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        // Append the first element without the separator
        sb.append(strings.get(0));

        // Append the rest of the elements, each prefixed by the separator
        for (int i = 1; i < strings.size(); i++) {
            sb.append(separator);
            sb.append(strings.get(i));
        }

        return sb.toString();
    }
}
