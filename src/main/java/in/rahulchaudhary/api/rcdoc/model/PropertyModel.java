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

package in.rahulchaudhary.api.rcdoc.model;

public class PropertyModel extends ApexModel {
    public PropertyModel() {
    }

    public void setNameLine(String nameLine, int iLine) {
        if (nameLine != null) {
            // remove any trailing stuff after property name. { =
            int i = nameLine.indexOf('{');
            if (i == -1)
                i = nameLine.indexOf('=');
            if (i == -1)
                i = nameLine.indexOf(';');
            if (i >= 0)
                nameLine = nameLine.substring(0, i);

        }
        super.setNameLine(nameLine, iLine);
    }

    public String getPropertyName() {
        String nameLine = getNameLine().trim();
        if (nameLine != null && nameLine.length() > 0) {
            int lastindex = nameLine.lastIndexOf(" ");
            if (lastindex >= 0) {
                String propertyName = nameLine.substring(lastindex + 1);
                return propertyName;
            }
        }
        return "";
    }
}
