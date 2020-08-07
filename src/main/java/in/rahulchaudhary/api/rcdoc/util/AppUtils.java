/*
 * MIT License
 *
 * Copyright (c) 2020 Rahul Chaudhary Official
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

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
