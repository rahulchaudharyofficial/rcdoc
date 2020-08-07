package in.rahulchaudhary.api.rcdoc.util;

public class AppUtils {
    public static String[] rgstrScope;
    public static String strContainsScope(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < rgstrScope.length; i++) {
            if (str.toLowerCase().contains(rgstrScope[i].toLowerCase() + " ")) {
                return rgstrScope[i];
            }
        }
        return null;
    }
    public static String strPrevWord(String str, int iSearch) {
        if (str == null)
            return null;
        if (iSearch >= str.length())
            return null;

        int iStart;
        int iEnd;
        for (iStart = iSearch - 1, iEnd = 0; iStart >= 0; iStart--) {
            if (iEnd == 0) {
                if (str.charAt(iStart) == ' ')
                    continue;
                iEnd = iStart + 1;
            } else if (str.charAt(iStart) == ' ') {
                iStart++;
                break;
            }
        }

        if (iStart == -1)
            return null;
        else
            return str.substring(iStart, iEnd);
    }
}
